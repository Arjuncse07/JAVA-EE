package com.arjun.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SessionServlet1
 */
@WebServlet("/SessionServlet1")
public class SessionServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		String name=request.getParameter("uname");
		out.println("<html>");
		out.println("<h1>Welcome"+name+" <br>  </h1>");
		
		out.println("Please Provide Your Age<br>");
		out.println("<form action='SessionServlet2' >");
		out.println("<input type='hidden' name='uname' value='"+name+"'>");
		out.println("Enter Age:<input type='text' name='age'>");
		out.println("<input type='submit' value='Submit Age'>");
		out.println("</form>");
		out.println("</html>");
		out.println();
		
		
	}

	

}
