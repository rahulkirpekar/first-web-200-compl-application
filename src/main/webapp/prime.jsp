<?xml version="1.0" encoding="UTF-8" ?>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Prime Numbers 1 to 200</title>
</head>
	<body>
	
	<%!
		boolean isPrime(int no)
		{
			for(int i = 2 ; i < no;i++)
			{
				if(no%i == 0)
				{
					return false;
				}
				
			}	
			return true;
		}
	%>
	
		
	<%
		out.print("<b>Prime Numbers : </b>");
		for(int i = 1;i<=200;i++)
		{
			if(isPrime(i))
			{
				out.print(i+" ");
			}
		} 
	%>	
			
			
			
			
	</body>
</html>
