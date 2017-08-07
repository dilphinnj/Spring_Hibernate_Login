package com.dilip.controller;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dilip.model.Student;
import com.dilip.model.User;
import com.dilip.dao.*;

@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	// @ResponseBody
	public String loadLogin() {
		return "welcome";
	}

	// @RequestMapping(value = "/login", method = RequestMethod.GET)
	// public String showLogin() {
	// System.out.println("login GET");
	// return "welcome";
	// }

	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public String showLogin2() {
		System.out.println("login GET");
		return "welcome";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView showLogin(Model model, @RequestParam String uName, @RequestParam String uPass) {
		
		System.out.println("name1=" + uName + "/pass1=" + uPass);

		// class path can be added by going to ->> properties/ configure java
		// build path - src/main/resources folder is added by default at creation
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("hbm_config.xml");
		context.getEnvironment();
		UserDAO userDAO = context.getBean(UserDAO.class);
		List<User> loginUser = userDAO.getUserNameAndPassword(uName, uPass);

		for (User u : loginUser) {
			System.out.println("Check List::>>>>>>>>>>>>>>>>>>>>" + u.getusrPassword());
		}

		context.close();

		if (loginUser.size() > 0) {
			model.addAttribute("uname", "login-" + uName);
			model.addAttribute("upass", "login-" + uPass);
			// ModelAndView(View view, String modelName, Object modelObject)
			return new ModelAndView("welcome", "model1", model);
		}

		else {
			model.addAttribute("errormsg", "invalid credentials!");
			return new ModelAndView("../login", "model1", model);
		}
	}

	@SuppressWarnings("unused")
	@RequestMapping(value = "regUser", method = RequestMethod.POST)
	public ModelAndView addUser(Model model, @RequestParam String uName, @RequestParam String uPass) {
		
		System.out.println("register user!");
//		User user = new User();
		User user = new User();
		user.setusrUserName(uName);
		user.setusrPassword(uPass);	
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("hbm_config.xml");
		context.getEnvironment();
		UserDAO userDAO = context.getBean(UserDAO.class);
		//StudentDAO stuDAO = context.getBean(StudentDAO.class);
		
		List<User> userList = userDAO.userList();
		
		boolean flag = false;
		
		for (User u : userList) {
			System.out.println("Check List 2::>>>>>>>>>>>>>>>>>>>>" + u.getusrUserName());
			
			if(uName.equals(u.getusrUserName())){
				flag = true;
				System.out.println("Username exist!");
				model.addAttribute("status","user exist!");
				return new ModelAndView("registerForm", "regModel", model);
				
			}
						
		}
		
		if(flag == false){
			//stuDAO.saveStudent(user);	
			userDAO.saveUser(user);
			model.addAttribute("status","user successfully added!");
			return new ModelAndView("../login", "regModel", model);
			
		}
		
		context.close();
		return new ModelAndView("registerForm", "regModel", model);
		
		
	}

}
