package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		System.out.println("LoginServlet : service()");
		
		String userName= request.getParameter("userName");
		String password= request.getParameter("password");

		PrintWriter out =	response.getWriter();

		out.print("LoginServlet :<br>");
		out.print("userName : " + userName+"<br>");
		out.print("password : " + password+"<br>");
	}
}