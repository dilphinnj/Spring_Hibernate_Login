package com.dilip.main;

import java.io.File;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dilip.dao.UserDAO;
import com.dilip.model.User;





public class SpringHibernateMain {

	public static void main(String[] args) {

		//class path can be added by going to ->> properties/ configure java build path - src/main/resources folder is added by default at creation
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("hbm_config.xml");
		context.getEnvironment();
		
		UserDAO UserDAO = context.getBean(UserDAO.class);
		
//		User User = new User();
//		User.setName("Shane"); 
//		User.setCountry("England");		
//		UserDAO.save(User);
		
//		System.out.println("User::"+User);
		
		List<User> list = UserDAO.userList();
				
		for(User u : list){
			System.out.println("User List::>>>>>>>>>>>>>>>>>>>>"+u.getusrUserName());
		}
		
		
		List<User> list2 = UserDAO.getUserNameAndPassword("dilip", null);
		
		for(User u : list2){
			System.out.println("User List::>>>>>>>>>>>>>>>>>>>>"+u.getusrPassword());
		}
		
		//close resources
		context.close();	
	}
}