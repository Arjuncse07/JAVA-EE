package com.arjun.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		ServletConfig config= this.getServletConfig();
		out.println("First Servlet init param-1"+config.getInitParameter("homeloan"));
	    out.println("<br><br>");
	     
		out.println("First Servlet init param-2"+config.getInitParameter("carloan"));
		out.println("<br><br>");
		
		
		
		ServletContext context = getServletContext();
		out.println("First Servlet context param-1"+context.getInitParameter("username"));
		out.print("<br><br>");
		
		out.print("First Servlet context param-1"+context.getInitParameter("password"));
	}

	
}
