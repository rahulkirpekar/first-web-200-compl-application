package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TenthServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");

		// get ServletContextObject
		ServletContext applicationConfig = getServletContext();
		
		String lang1 = applicationConfig.getInitParameter("lang1");
		String lang2 = applicationConfig.getInitParameter("lang2");
		String lang3 = applicationConfig.getInitParameter("lang3");
		String lang4 = applicationConfig.getInitParameter("lang4");

		PrintWriter out = response.getWriter();
		
		out.print("<h2>TenthServlet : </h2><br>");
		out.print("lang1 : " + lang1 +"<br>");
		out.print("lang2 : " + lang2 +"<br>");
		out.print("lang3 : " + lang3 +"<br>");
		out.print("lang4 : " + lang4 +"<br>");
	}
}
