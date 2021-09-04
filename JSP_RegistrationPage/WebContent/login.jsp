<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.io.*,java.util.*,java.sql.*"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Please Login Below</h3>
<form action="login.jsp" method="post">  
  
UserName:<input type="text" name="userName"/><br/><br/>  
Password:<input type="password" name="userPass"/><br/><br/>    
<input type="submit" value="login"/>  
  
</form> 

<%
try {		
	response.setContentType("text/html");  
	PrintWriter out1 = response.getWriter();  
	          
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("Driver Class is found");
	
	//step-2
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration?autoReconnect=true&useSSL=false","root","root");
	System.out.println("Connected");
	
	String n=request.getParameter("userName");  
	String p=request.getParameter("userPass"); 
	
	PreparedStatement ps=con.prepareStatement("SELECT * FROM  registration.registeruser Where NAME=? AND PASS=?");
	
	ps.setString(1,n);
	ps.setString(2,p);
	
	ResultSet rs=ps.executeQuery();
	if(rs.next())
	{
		out1.print("<h1><center>You have Login Successfully...!!!</center></h1>");
	}
	else
	{
		out1.print("<h1><center>You are not registered</center></h1><br> ");
		out1.print("<h3><a href=\"register.html\">click here to register</a><h3>");
	}


  }
  catch (Exception e1) {
		e1.printStackTrace();
	}
  

%> 
</body>
</html>