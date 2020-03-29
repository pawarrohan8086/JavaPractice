package com.rs.tax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/surl")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name=null,adhar=null;
		Cookie cr[]=request.getCookies();
		if(cr!=null) {
			name=cr[0].getValue();
			adhar=cr[1].getValue();
		}
		String income=request.getParameter("income");
		String tax=request.getParameter("tax");
		
		PrintWriter out=response.getWriter();
		out.println("<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"ISO-8859-1\">\r\n" + 
				"<title>Details</title>\r\n" + 
				"</head>\r\n" + 
				"<body >\r\n" + 
				"	<br>\r\n" + 
				"	<br>\r\n" + 
				"	<br>\r\n" + 
				"	<br>\r\n" + 
				"	<br>\r\n" + 
				"	<br>\r\n" + 
				"	<br>\r\n" + 
				"	<br>\r\n" + 
				"	<br>\r\n" + 
				"	<br>\r\n" + 
				"	<br>\r\n" + 
				"	<center>\r\n" + 
				"		<table>\r\n" + 
				"			\r\n" + 
				"			<tr>\r\n" + 
				"			<th>\r\n" + 
				"				Name :\r\n" + 
				"			</th>\r\n" + 
				"			<td>"+name+"</td>\r\n" + 
				"			</tr>\r\n" + 
				"\r\n" + 
				"			<tr>\r\n" + 
				"			<th>\r\n" + 
				"				Adhar  :\r\n" + 
				"			</th>\r\n" + 
				"			<td>"+adhar+"</td>\r\n" + 
				"			</tr>\r\n" + 
				"\r\n" + 
				"			<tr>\r\n" + 
				"			<th>\r\n" + 
				"				Total Income :\r\n" + 
				"			</th>\r\n" + 
				"			<td>"+income+"</td>\r\n" + 
				"			</tr>\r\n" + 
				"\r\n" + 
				"			<tr>\r\n" + 
				"			<th>\r\n" + 
				"				Tax :\r\n" + 
				"			</th>\r\n" + 
				"			<td>"+tax+"</td>\r\n" + 
				"			</tr>\r\n" + 
				"\r\n" + 
				"		</table>\r\n" + 
				"	</center>\r\n" + 
				"</body>\r\n" + 
				"</html>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
