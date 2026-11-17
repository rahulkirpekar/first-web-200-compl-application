<?xml version="1.0" encoding="UTF-8" ?>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Insert title here</title>
</head>
<body>

	<%
		String companyName = (String)application.getAttribute("company");
	%>
	Company Name : <%=companyName%>
	
	
	<%
		pageContext.setAttribute("msg","Hello Jsp World");
		out.print("pageContext.getAttribute('msg') : " + pageContext.getAttribute("msg"));
	%>

</body>
</html>
