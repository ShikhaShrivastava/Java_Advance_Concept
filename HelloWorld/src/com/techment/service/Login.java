package com.techment.service;

import java.io.IOException;
import java.io.PrintWriter;

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
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello..! Servlet called ");
		PrintWriter out=response.getWriter();
//		out.print("This is my first server");
		
		String name= request.getParameter("u");
		String passw= request.getParameter("p");
		
		int nameLength= name.length();
		System.out.println("Your Name is : "+name+" & the size of length is: "+nameLength);
		out.print("Your Name is : "+name+" & the size of length is: "+nameLength);
	}

}
