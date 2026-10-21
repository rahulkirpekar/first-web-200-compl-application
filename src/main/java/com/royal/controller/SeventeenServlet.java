package com.royal.controller;

import java.io.IOException;

import com.royal.bean.StudentBean;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SeventeenServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// getSession object
		HttpSession session = request.getSession(false);
		
		if(session != null ) 
		{
			StudentBean sbean = (StudentBean)	session.getAttribute("student");
			System.out.println("SeventeenServlet : " + sbean.getRno()+" " + sbean.getName()+" " + sbean.getStd()+" " + sbean.getMarks());
		}else 
		{
			System.out.println("SeventeenServlet session--is NULL");
		}
	}
}
