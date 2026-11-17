<?xml version="1.0" encoding="UTF-8" ?>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Insert title here</title>
</head>
<body>
<%-- 	<% --%>
// 		out.print("Hello World");
<%-- 	%> --%>
	
		<%
			String userName = (String)session.getAttribute("userName");
			
			out.print("userName : " + userName);
		
			application.setAttribute("company", "Royal Technosoft Private Limited");
		%>
		
		
		
		
</body>
</html>
