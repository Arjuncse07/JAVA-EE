package com.arjun.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname=request.getParameter("uname");
		String uage=request.getParameter("uage");
		
		//maintain the first state of a session
		//create a session object to maintain the state on the server
		HttpSession session=request.getSession();
		
		session.setAttribute("uname", uname);
		session.setAttribute("uage", uage);
		
		//To give second form to the client the RequestDispacter used
		request.getRequestDispatcher("form2.html").forward(request, response);
		
	}

}
