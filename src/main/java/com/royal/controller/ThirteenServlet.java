package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.royal.bean.StudentBean;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ThirteenServlet  extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = 	response.getWriter();
		
		response.setContentType("text/html");
		
		StudentBean s = (StudentBean)request.getAttribute("student");
		
		System.out.println("ThirteenServlet : " + s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
		
	}
}