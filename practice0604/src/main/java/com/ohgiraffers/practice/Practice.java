package com.ohgiraffers.practice;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/practice-request")
public class Practice extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String httpMethod = request.getMethod();
		System.out.println("http method:" + httpMethod);

		if ("GET".equals(httpMethod)) {
			doGet(request, response);
		} else if ("POST".equals(httpMethod)) {
			doPost(request, response);
		}

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("GET 요청 처리를 위한 doGet() 호출됨");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("POST 요청 처리를 위한 doPost() 호출됨");
	}

}
