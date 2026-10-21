package com.royal.controller;

import java.io.IOException;

import com.royal.bean.StudentBean;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class FourteenServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// Data - StudentBean - Object
		StudentBean sbean = new StudentBean(1, "Rahul", 10, 100);
		
		// get session object ---create sesssion objects
		HttpSession session = request.getSession(true);
		
		// store data into session object
		session.setAttribute("student", sbean);
		
	}
}
