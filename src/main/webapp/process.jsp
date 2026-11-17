<?xml version="1.0" encoding="UTF-8" ?>
<html xmlns="http://www.w3.org/1999/xhtml">

<%@ page errorPage="error.jsp" %>

<head>
<title>Process Jsp</title>
</head>
<body>

	<%
		String num1= request.getParameter("no1");
		String num2= request.getParameter("no2");
		
		int no1 = Integer.parseInt(num1);
		int no2 = Integer.parseInt(num2);
		
		int c = no1 / no2;
		
		out.print("Division of numbers is: "+c);  
	%>

</body>
</html>
