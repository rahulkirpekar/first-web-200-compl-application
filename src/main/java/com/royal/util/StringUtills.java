package com.royal.util;

public class StringUtills 
{
	public static boolean isValidString(String value) 
	{
		if((value != null) && (value.trim().length() > 0)) 
		{
			return true;
		}
		return false;
	}
}
