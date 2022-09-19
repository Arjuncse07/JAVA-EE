package com.arjun.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SessionServlet3
 */
@WebServlet("/SessionServlet3")
public class SessionServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		String name=request.getParameter("uname");
		String age=request.getParameter("uage");
		String gfriend=request.getParameter("ugfriend");
		
		out.println("<h1>***Your Total Information is*******************<br/>");
		out.println("Name: "+name+"<br/>      ");
		out.println("Age: "+age+"<br/>    ");
		out.println("GirlFriend Name: "+gfriend+" <br/> ");
		out.println("Thanks For Providing Complete Information</h1>");
		}

	

}
