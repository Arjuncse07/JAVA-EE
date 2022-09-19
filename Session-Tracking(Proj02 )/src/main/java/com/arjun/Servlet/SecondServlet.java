package com.arjun.Servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		String uqual=request.getParameter("uqual");
		String udesign=request.getParameter("udesign");
		
		HttpSession session=request.getSession();
		
		session.setAttribute("uqual", uqual);
		session.setAttribute("udesign", udesign);
		
		request.getRequestDispatcher("form3.html").forward(request, response);
		   
		
		

	}

}
