package com.webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet( urlPatterns="/login.do")
public class LoginServlet extends HttpServlet{
	
	UserValidationService service = new UserValidationService();
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);	
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		System.out.println("name" + name);
		boolean isUserValid=service.isUserValid(name, password);
		if(isUserValid)
		{	
			request.setAttribute("name", request.getParameter("name"));
			request.setAttribute("password", request.getParameter("password"));
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		}	
		else
		{	
			request.setAttribute("errormsg", "Invalid user login details");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}	
	}
	
}