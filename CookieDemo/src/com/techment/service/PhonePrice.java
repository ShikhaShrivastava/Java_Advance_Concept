package com.techment.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PhonePrice
 */
@WebServlet("/PhonePrice")
public class PhonePrice extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int price=40000;
		PrintWriter pw= response.getWriter();
		
		int quantity= Integer.parseInt(request.getParameter("mobile"));
		pw.print("You have selected " +quantity);
		
		double totalprice=quantity*price;
		pw.print("Total price "+totalprice);
		
		pw.print(" <a href='Cart'>Add to cart</a>");
		
		String totPrice=String.valueOf(totalprice);
		
		Cookie cookie= new Cookie("mobileprice",String.valueOf(totalprice));
		response.addCookie(cookie);

	}

}
