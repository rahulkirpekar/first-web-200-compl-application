package com.royal.controller;

import java.io.IOException;

import com.royal.bean.StudentBean;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ElevenServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		StudentBean sbean = new StudentBean(1, "Ganesh", 10, 100);
		
		System.out.println("ElevenServlet : " + sbean.getRno()+" " + sbean.getName()+" " + sbean.getStd()+" " + sbean.getMarks());

		// Data ---> sbean object
		request.setAttribute("student", sbean);
		
		RequestDispatcher rd= request.getRequestDispatcher("TwelveServlet");
		rd.forward(request, response);
	}
}
