package com.arjun.sevlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DisplayServlet
 */
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		HttpSession session=request.getSession(false);
		
		out.println("Username= "+session.getAttribute("username"));
		out.println("<br>");
		out.println("Age= "+session.getAttribute("uage"));
		out.println("<br>");
		out.println("Qualification= "+session.getAttribute("uqual"));
		out.println("<br>");
		out.println("User Designation= "+session.getAttribute("udesig"));
		out.print("<br>");
		out.println("User Email= "+session.getAttribute("email"));
		out.println("<br>");
		out.println("User Mobile= "+session.getAttribute("mobile"));
		
	}

}
