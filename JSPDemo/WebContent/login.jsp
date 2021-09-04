<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%!
int a=10;
int b=30;
int add(int a, int b)
{
	return a+b;
}
%>

<%

String username=request.getParameter("u");
String password=request.getParameter("p");
out.print("username: "+username);
out.print("password: "+password);

//out.println("value of a= "+a);
out.println(add(2,4)+"<br><br>");

%>

<%=a%>
<%= "Result of add = "+add(4,6)+" value of a = "+a+" value of b ="+b %>
<%-- a + " " + b + "<br>"--%>

</body>
</html>