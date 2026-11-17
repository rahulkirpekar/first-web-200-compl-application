<?xml version="1.0" encoding="UTF-8" ?>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Multiplication Table</title>
</head>
<body>
	<table>

	<% 
		for(int i = 1 ; i<=10;i++)
		{
	%>		
		<tr>
			<td><%=5%></td>
			
			<td> * </td>
			
			<td><%=i%></td>
			
			<td> = </td>
			
			<td><%=5*i%></td>
		</tr>
	<% 		
		}
	%>
	
	</table>
</body>
</html>
