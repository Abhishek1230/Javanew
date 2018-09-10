package com.abhishek.first;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class OfficerDisplay extends HttpServlet

{
		
	List<Officer> officers = new ArrayList<Officer>();
		
	OfficerService sd = new OfficerService();
	
public OfficerDisplay() {
		
	}

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
{
		String cpi = request.getParameter("cpi");
		int result = Integer.parseInt(cpi);
		if(result == 1) {
			
			Officer st = new Officer();
			String abc = request.getParameter("abc");
			int xyz = Integer.parseInt(request.getParameter("xyz"));
			int age = Integer.parseInt(request.getParameter("age"));
			st.setId(xyz);
			st.setName(abc);
			st.setPin(age);
			sd.save(st);
			officers = sd.display();
			request.setAttribute("officer", officers);
			request.getRequestDispatcher("forward.jsp").forward(request, response);
			
		}
		else if(result ==2) {
			officers = sd.display();
			request.setAttribute("officer", officers);
			request.getRequestDispatcher("forward.jsp").forward(request, response);
					
		}
				
	}

}