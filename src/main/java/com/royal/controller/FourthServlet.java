package com.royal.controller;

import java.io.IOException;
import java.util.Scanner;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FourthServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter No which you want to print Table : ");
		int no = sc.nextInt();
		
		for (int i = 1; i <=10; i++) 
		{
			System.out.println(no+" * " + i +" = " + (no*i));
		}
	}
}
