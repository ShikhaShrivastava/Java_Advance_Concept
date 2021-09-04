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
<h3>Please Register Here</h3>
<form action="register.jsp" method="post">  
  
<label for="email"><b>UserName</b></label>
    <input type="text" placeholder="Enter Username" name="userName" >

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="userPass">

    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter emailId@gmail.com" name="userEmail">
    
    <label for="country"><b>Country</b></label>
    <select name="userCountry">  
       <option>India</option>  
       <option>Pakistan</option>  
       <option>other</option>  
    </select>  

    <button type="submit" class="registerbtn" value="register">Register</button>
  
</form>  

<%

try {
	response.setContentType("text/html");  
	PrintWriter out1 = response.getWriter();  
	          
	String n=request.getParameter("userName");  
	String p=request.getParameter("userPass");  
	String e=request.getParameter("userEmail");  
	String c=request.getParameter("userCountry"); 
	
	
		//step-1
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Class is found");
		
		//step-2
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration?autoReconnect=true&useSSL=false","root","root");
		System.out.println("Connected");
		
		PreparedStatement ps = con.prepareStatement("insert into registeruser values(?,?,?,?)");
		
		ps.setString(1,n);
		ps.setString(2,p);
		ps.setString(3, e);
		ps.setString(4, c);
		int i=ps.executeUpdate();  
		if(i>0)  
		out1.print("<hr><h1><center>You are successfully registered...</center></h1><hr>"); 	
		else
			out1.println("<h1>Failed to register<h1>");
		
	} catch (Exception e1) {
		e1.printStackTrace();
	}


%>
</body>
</html>