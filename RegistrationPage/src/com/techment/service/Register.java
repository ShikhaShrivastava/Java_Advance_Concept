package com.techment.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		          
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
			out.print("<h1><center>You are successfully registered...</center></h1>"); 	
			else
				System.out.println("Failed to register");
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}


	}

}
