package com.royal.util;

import java.sql.Connection;
import java.sql.DriverManager;

// Database Connection
public class DBConnection 
{
	// 1. Make Credentials
	
	private static final String URLNAME     = "jdbc:mysql://localhost:3306/200db" ;
	private static final String DRIVERCLASS = "com.mysql.cj.jdbc.Driver" ;// Driver.class fetch from jdbc jar
	private static final String USERNAME    = "root" ;
	private static final String PASSWORD	= "root" ;
	

	// 2. getConnection Method
	public static Connection getConnection() 
	{
		Connection conn = null;
		try 
		{
			// 3. Load Driver class
			Class.forName(DRIVERCLASS);// Optional

			// 4. Pass Credentials --->DriverManager's getConnection method
			conn = DriverManager.getConnection(URLNAME, USERNAME, PASSWORD);
			
			// 5. validate conn object
			if (conn != null) 
			{
				System.out.println("Db connected : " + conn);
			} 
			else 
			{
				System.out.println("Db not connected. : " + conn);// null
			} 
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		return conn;
	}
	public static void main(String[] args) 
	{
		DBConnection.getConnection();
	}
}
