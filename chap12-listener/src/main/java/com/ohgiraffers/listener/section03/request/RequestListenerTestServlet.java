package com.ohgiraffers.listener.section03.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/request")
public class RequestListenerTestServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setAttribute("username", "squirrel"); //request attribute 추가
		
		request.setAttribute("hieght", 900); // request attribute 추가
		
		request.setAttribute("height", 1500); // request attribute 추가
		
		request.removeAttribute("height"); // request attribute 삭제
	}

}
