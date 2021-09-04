package com.techment.requestdispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
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
		//Taking value from form
		PrintWriter out=response.getWriter();
		int age= Integer.parseInt(request.getParameter("age"));
		
		if(age>=18)
		{
			RequestDispatcher rd= request.getRequestDispatcher("Welcome.html");
			rd.forward(request, response);

		}
		else
		{
			out.print("You can not vote age is less than 18");
			RequestDispatcher rd= request.getRequestDispatcher("index.html");
			rd.include(request, response); //if not then including req to index.html
		}
		
	}

}
