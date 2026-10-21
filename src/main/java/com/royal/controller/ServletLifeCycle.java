package com.royal.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletLifeCycle extends HttpServlet
{
	@Override
	public void init() throws ServletException 
	{
		System.out.println("ServletLifeCycle : init()---"+this);
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		System.out.println("ServletLifeCycle : service()---"+this);
	}
	
	@Override
	public void destroy() 
	{
		System.out.println("ServletLifeCycle : destroy()---"+this);
	}
}
