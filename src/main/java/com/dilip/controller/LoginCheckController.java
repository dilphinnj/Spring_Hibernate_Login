package com.dilip.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//Either below servlet mapping or a mapping in web.xml
//@WebServlet("/LoginCheckController1")
public class LoginCheckController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginCheckController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Get Request for /LoginCheckController1 ").append(request.getContextPath());
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//doGet(request, response);
		String usrName = request.getParameter("uName");
		String usrPass = request.getParameter("uPass");
		System.out.println("<html>un="+usrName+"/"+"upass="+usrPass+"</html>");
		PrintWriter out = response.getWriter();
		out.write("<html> <h2>Welcome user name="+usrName+" / "+" user password="+usrPass+"</h2></html>");
		

		
		if (usrName.equals("dilip") && usrPass.equals("pass123")) {
			RequestDispatcher rd=request.getRequestDispatcher("views/welcome.jsp");
			rd.forward(request, response);
		}
		
		else{
			// *** add include to attach a jsp to same page		
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			rd.include(request, response);
		}
		
		
		//response.getWriter().append("un="+usrName+"/"+"upass="+usrPass);
		
	}
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
		
	}
	
	

}
