<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>this is my first jsp file</h1>
<h2>Jsp is dynamic compilation just refresh the page</h2>
<%
int a=10;
int b=20;
int c=a+b;
out.print("Result :"+c);
for(int i=1; i<=5; i++)
{
out.print("the value of i is: "+i+"<br>");
}
%>
<hr>
<form action="login.jsp">
<input type="text" name="u" placeholder="username">
<input type="password" name="P" placeholder="password">
<input type="submit" value="LOGIN">
</form>
<hr>
</body>
</html>