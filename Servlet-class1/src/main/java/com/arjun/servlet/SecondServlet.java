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
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		ServletConfig config= this.getServletConfig();
		out.println("Second Servlet init-param-2"+config.getInitParameter("vcs1"));
		out.println("<br><br>");
		
		out.println("Second Servlet context param-2"+config.getInitParameter("vcs2"));
		out.println("<br><br>");
		
		ServletContext context = getServletContext();
		out.println("Second Servlet context param-2"+context.getInitParameter("username"));
		out.println("<br><br>");
		
		out.println("Second Servet context param-2"+context.getInitParameter("password"));
		
		
	}

	
}
