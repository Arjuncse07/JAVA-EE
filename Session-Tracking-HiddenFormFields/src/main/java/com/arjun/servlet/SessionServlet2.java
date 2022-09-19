package com.arjun.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SessionServlet2
 */
@WebServlet("/SessionServlet2")
public class SessionServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		String name=request.getParameter("uname");
		String age=request.getParameter("age");
		out.println("<h1>Hi"+name+" Please Enter Your GirlFriend Name...");
		
		out.println("<form action='/SessionServlet3'>");
		out.println("<input type='hidden' name='uname ' value='"+name+"'  >");
		out.println("<input type='hidden' name='uage' value='"+age+"'>");
		out.println("Enter GirlFriendName:<input type='text' name='ugfriend'><br>  ");
		out.println("<input type='submit' value='Submit GF'> ");
		out.println("</form>");
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
