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
		request.getRequestDispatcher("/WEB-INF/views/NewFile.jsp").forward(request, response);
		
		}
}