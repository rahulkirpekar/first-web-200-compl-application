package com.royal.controller;

import java.io.IOException;

import com.royal.bean.StudentBean;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EighteenServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// Data --- sbean
		StudentBean sbean = new StudentBean(1, "Ankur", 10, 100);
		
		// getServletContext object-->Application scope
		ServletContext config = getServletContext();
		
		config.setAttribute("student", sbean);
		
		System.out.println("EighteenServlet -- attribute added in ServletContext scope");
	}
}
