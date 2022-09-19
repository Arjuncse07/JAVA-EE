package com.arjun.sevlet;

import java.io.IOException;
import java.io.PrintWriter;

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
       
    @SuppressWarnings("deprecation")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uqual =request.getParameter("uqual");
		String udesig=request.getParameter("udesig");
		
		HttpSession session=request.getSession();
		session.setAttribute("uqual", uqual);
		session.setAttribute("udesig", udesig);
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		out.println("<html>");
		out.println("<body bgcolor='aqua'>");
		out.println("<form method='post' action="+response.encodeUrl("./DisplayServlet")+">");
		out.println("<br>");
		out.println("user Email :<input type='email' name='email'/>");
		out.println("<br>");
		out.println("user Mobile :<input type='text' name='mobile'/>");
		out.println("<br>");
		out.println("<input type='submit' value='display'/>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}

}
