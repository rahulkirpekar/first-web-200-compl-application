package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FifthServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();

		int no = 10;

		out.print("<table border='1'>");
		
		for (int i = 1; i <=10 ; i++) 
		{
			out.print("<tr>");
			out.print("<td>"+no+" * " + i + " = " + (no*i)+"</td>");
			out.print("</tr>");
		}
		
		out.print("</table>");
	}
}
