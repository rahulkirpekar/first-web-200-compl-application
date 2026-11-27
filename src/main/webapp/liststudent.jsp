<?xml version="1.0" encoding="UTF-8" ?>
<%@page import="com.royal.bean.StudentBean"%>
<%@page import="java.util.ArrayList"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>List of Student Records</title>
</head>
<body>
		<%
			ArrayList<StudentBean> list = (ArrayList<StudentBean>)request.getAttribute("list");
		%>

		<h1>List of Student Records</h1>
	
		<table border='1'>
			<tr>
				<td>Rno</td>
				<td>FullName</td>
				<td>Age</td>
				<td>Course</td>
				<td>Gender</td>
				<td>Hobbies</td>
				<td>DOB</td>
				<td>Email</td>
				<td>Mobile</td>
				<td>Address</td>
				<td>ACTIONS</td>
			</tr>	
			
			<%
				for(int i = 0 ; i < list.size();i++)
				{
					StudentBean s = list.get(i);
					
			%>
					<tr>
						<td><%=s.getRno() %></td>
						<td><%=s.getFullName() %></td>
						<td><%=s.getAge() %></td>
						<td><%=s.getCourse() %></td>
						<td><%=s.getGender() %></td>
						<td><%=s.getHobbiesStr() %></td>
						<td><%=s.getDob() %></td>
						<td><%=s.getEmail() %></td>
						<td><%=s.getMobile() %></td>
						<td><%=s.getAddress() %></td>
						<td> <a href="#">EDIT</a> | <a href="#">DELETE</a></td>
					</tr>	
			<% 		
				}
			%>
				
		</table>
	
	
</body>
</html>
