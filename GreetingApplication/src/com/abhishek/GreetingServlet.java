package com.abhishek;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GreetingServlet extends HttpServlet {
	
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException , IOException
{
	
	String firstname = req.getParameter("fname");
	String lastname = req.getParameter("lname");
	String city = req.getParameter("cityname");
	
	PrintWriter out = resp.getWriter();
	
	resp.setContentType("text/html");
	
	out.println("<html>");
	out.println("<head><title>Greeting Application</title></head>");
	out.println("<body>");
	out.println("<table border = \"1\">");

	
	 out.println("<tr>");
	    out.println("<th width = \"200 px\">Firstname</th>");
	    out.println("<th  width = \"200  px\">Lastname</th> ");
	    out.println("<th width = \"200 px\">cityname</th>");
	    out.println("</tr>");
	    out.println("<tr>");
	    out.println("<td >"+ firstname+ "</td>");
	    out.println("<td>"+ lastname+ "</td> ");
	    out.println("<td>"+city+"</td>");
	    out.println("</tr>");
	    out.println("</table>");
	
	
	out.println("</body>");
	out.println("</html>");
	
	

}
}
