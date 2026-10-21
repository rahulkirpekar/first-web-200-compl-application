package com.royal.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SixthServlet extends HttpServlet
{
	@Override
	public void init() throws ServletException 
	{
		System.out.println("SixthServlet : init()---"+this);
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		System.out.println("SixthServlet : service()---"+this);
	}
	
	@Override
	public void destroy() 
	{
		System.out.println("SixthServlet : destroy()---"+this);
	}
}
