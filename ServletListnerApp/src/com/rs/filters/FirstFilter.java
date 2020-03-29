package com.rs.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter("/furl")
public class FirstFilter implements Filter {


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String uname=request.getParameter("uname");
		String password=request.getParameter("pswd");
		if(uname.equalsIgnoreCase("rohan")) {
			if(password.equalsIgnoreCase("r0h@n8086")) {
			
				chain.doFilter(request, response);
			}else {
				out.println("<center>Password  Invalid</center>");
			}
				
		}else
		{
			
			out.println("<center>Username not valid</center>");
		}
		
	}

	

}
