package com.arjun.Servlet;

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
		//Used if session is available and it will locate the object
		HttpSession session=request.getSession(false);
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		out.println("<html>");
		out.println("<body bgcolor='aqua'>");
		out.println("<center><h1>");
		out.println("<br><br>");
		
		out.println("User Name"+session.getAttribute("uname")+"<br><br>");
		out.println("User Age"+session.getAttribute("uage")+"<br><br>");
		out.println("Qualification"+session.getAttribute("uqual")+"<br><br>");
		out.println("Designation"+session.getAttribute("udesign")+"<br><br>");
		
		out.println("Email"+request.getParameter("email")+"<br><br>");
		out.println("Mobile"+request.getParameter("mobile")+"<br><br>");
		
		out.println("</h1></center>");
		out.println("</body>");
		out.println("</html>");
		
         		
	}

}
