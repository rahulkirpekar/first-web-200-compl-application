package com.royal.controller;

import java.io.IOException;

import com.royal.bean.StudentBean;
import com.royal.dao.StudentDao;
import com.royal.util.StringUtills;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class InsertStudentServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		boolean flag = true;
		
		// Backend Validation
		StudentBean sbean =  new StudentBean();
		
		String fullName = request.getParameter("fullName");
		
		if( StringUtills.isValidString(fullName)) 
		{
			sbean.setFullName(fullName);
		}
		else 
		{
			// set error msg - request---FullNameErr
			request.setAttribute("fullNameErr", "<font color='red'>Please enter valid FullName.</font>");
			flag = false;
		}
		
		String ageStr = request.getParameter("age");
		
		
		if( StringUtills.isValidString(ageStr)) 
		{
			int age = Integer.parseInt(ageStr);
			
			if (age != 0) 
			{
				sbean.setAge(age);	
			}
			else 
			{
				// set error msg - request---AgeErr
				request.setAttribute("ageErr", "<font color='red'>Please enter valid Age.</font>");
				flag = false;
			}
		}
		else 
		{
			// set error msg - request---AgeErr
			request.setAttribute("ageErr", "<font color='red'>Please enter valid Age.</font>");
			flag = false;
		}
		
		String course = request.getParameter("course");
		
		if( StringUtills.isValidString(course)) 
		{
			sbean.setCourse(course);
		}
		else 
		{
			// set error msg - request---courseErr
			request.setAttribute("courseErr", "<font color='red'>Please enter valid Course.</font>");
			flag = false;
		}
		
		
		String gender = request.getParameter("gender");
		
		if( StringUtills.isValidString(gender)) 
		{
			sbean.setGender(gender);
		}
		else 
		{
			// set error msg - request---genderErr
			request.setAttribute("genderErr", "<font color='red'>Please enter valid Gender.</font>");
			flag = false;
		}
		
		
		String hobbies[] = request.getParameterValues("hobby");
		
		if( hobbies != null) 
		{
			sbean.setHobbies(hobbies);
		}
		else 
		{
			// set error msg - request---hobbiesErr
			request.setAttribute("hobbiesErr", "<font color='red'>Please enter valid Hobbies.</font>");
			flag = false;
		}
		
		String dob = request.getParameter("dob");
		
		if( StringUtills.isValidString(dob)) 
		{
			sbean.setDob(dob);
		}
		else 
		{
			// set error msg - request---dobErr
			request.setAttribute("dobErr", "<font color='red'>Please enter valid Date of Birth.</font>");
			flag = false;
		}
		
		String email = request.getParameter("email");
		
		if( StringUtills.isValidString(email)) 
		{
			sbean.setEmail(email);
		}
		else 
		{
			// set error msg - request---emailErr
			request.setAttribute("emailErr", "<font color='red'>Please enter valid Email.</font>");
			flag = false;
		}
		
		String mobile = request.getParameter("mobile");
		
		if( StringUtills.isValidString(mobile)) 
		{
			sbean.setMobile(mobile);
		}
		else 
		{
			// set error msg - request---mobileErr
			request.setAttribute("mobileErr", "<font color='red'>Please enter valid Mobile.</font>");
			flag = false;
		}

		String address = request.getParameter("address");
		
		if( StringUtills.isValidString(address)) 
		{
			sbean.setAddress(address);
		}
		else 
		{
			// set error msg - request---addressErr
			request.setAttribute("addressErr", "<font color='red'>Please enter valid Address.</font>");
			flag = false;
		}
		
		RequestDispatcher rd = null;
		
		// sbean---studentDao----insert---MySQL--Table
		
		if (flag) 
		{
			// flag---true
		
			StudentDao studentDao = new StudentDao();
			
			int rowsAffeected = studentDao.insertStudent(sbean);
			
			if (rowsAffeected > 0) 
			{
				// ListStudentServlet
				rd = request.getRequestDispatcher("ListStudentServlet");
			} else 
			{
				// student-registration.jsp
				rd = request.getRequestDispatcher("student-registration.jsp");
			}
		} 
		else 
		{
			// student-registration.jsp
			rd = request.getRequestDispatcher("student-registration.jsp");
		}
		
		rd.forward(request, response);
		
//		System.out.println("fullName : " + fullName);
//		System.out.println("ageStr : " + ageStr);
//		System.out.println("course : " + course);
//		System.out.println("gender : " + gender);
//		System.out.println("Hobbies : ");
		
//		for (int i = 0; i < hobbies.length; i++) 
//		{
//			System.out.println("hobbies["+ i +"] : " + hobbies[i]);
//		}
		
//		System.out.println("dob : " + dob);
//		System.out.println("email : " + email);
//		System.out.println("mobile : " + mobile);
//		System.out.println("address : " + address);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}
