package com.techment.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      try {		
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		          
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
			out.print("<h1><center>You have Login Successfully...!!!</center></h1>");
		}
		else
		{
			out.print("<h1><center>You are not registered</center></h1><br> ");
			out.print("<h3><a href=\"register.html\">click here to register</a><h3>");
		}


      }
      catch (Exception e1) {
			e1.printStackTrace();
		}
      
	}

}
