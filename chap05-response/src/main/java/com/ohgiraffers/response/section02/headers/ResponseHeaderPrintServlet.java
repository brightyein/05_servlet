package com.ohgiraffers.response.section02.headers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;

@WebServlet("/headers")
public class ResponseHeaderPrintServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter(); 
		response.setContentType("text/html; charset=UTF-8");
		out.print("현재 시간은 " + System.currentTimeMillis() + " 입니다.");
		out.close();
		
		Collection<String> responseHeader = response.getHeaderNames();
		Iterator<String> iter = responseHeader.iterator();
		while(iter.hasNext()) {
			String headerName = iter.next();
			System.out.println(headerName + " : " + response.getHeader(headerName));
			
		}
	}

}
