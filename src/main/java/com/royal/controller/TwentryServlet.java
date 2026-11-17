package com.royal.controller;

import java.io.IOException;

import com.royal.bean.StudentBean;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TwentryServlet  extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// getServletContext --Application Scope
		ServletContext context = getServletContext();
		
		StudentBean s = (StudentBean)context.getAttribute("student");
		System.out.println("TwentryServlet : " + s.getRno()+" " + s.getName()+" " + s.getStd()+" "+s.getMarks());
		
	}
}