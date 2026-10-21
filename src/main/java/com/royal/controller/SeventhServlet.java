package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SeventhServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// SeventhServletConfig
		ServletConfig config = getServletConfig();
		
		String urlName = config.getInitParameter("urlName");
		String driverClass = config.getInitParameter("driverClass");
		String userName = config.getInitParameter("userName");
		String password = config.getInitParameter("password");
		
		PrintWriter out = response.getWriter();
		
		out.print("<b1>SeventhServlet : </b1><br>");
		out.print("<b1>urlName : </b1>" + urlName+"<br>");
		out.print("<b1>driverClass : </b1>" + driverClass+"<br>");
		out.print("<b1>userName : </b1>" + userName+"<br>");
		out.print("<b1>password : </b1>" + password+"<br>");	
	}
}
