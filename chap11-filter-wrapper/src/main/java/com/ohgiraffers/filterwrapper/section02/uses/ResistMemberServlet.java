package com.ohgiraffers.filterwrapper.section02.uses;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@WebServlet("/member/regist")
public class ResistMemberServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userId = request.getParameter("userId");
		String password = request.getParameter("pssword");
		String name = request.getParameter("name");
		
		System.out.println("userId: " + userId);
		System.out.println("password: " + password);
		System.out.println("name: " + name);
		
		// passwordEncoder 로 복호화된 비밀번호 일치 확인하기
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		boolean isEqual1 = passwordEncoder.matches("pass01", password);
		boolean isEqual2 = passwordEncoder.matches("pass02", password);
		System.out.println("password == pass01 ?" + isEqual1);
		System.out.println("password == pass02 ?" + isEqual2);
		
		
		response.setContentType("text/html; charser=UTF-8");
		
		PrintWriter out = response.getWriter();
		out.println("<!doctype html>");
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>" + name + "님 회원 가입을 축하합니다~!</h1>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
		
	}

}
