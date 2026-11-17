<?xml version="1.0" encoding="UTF-8" ?>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Implicit Objects</title>
</head>
<body>

	<%
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");	
	%>

	Welcome, <%=userName%><br>

	UserName - <%=userName %><br>
	Password - <%=password%>



</body>
</html>
