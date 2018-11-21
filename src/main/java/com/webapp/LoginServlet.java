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

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		String name =  request.getParameter("name");
		System.out.println(request.getParameter("name"));
		request.setAttribute("name", name);
		request.getRequestDispatcher("/WEB-INF/views/NewFile.jsp").forward(request, response);
		
		}
}