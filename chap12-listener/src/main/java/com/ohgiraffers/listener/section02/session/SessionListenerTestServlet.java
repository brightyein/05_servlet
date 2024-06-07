package com.ohgiraffers.listener.section02.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import org.apache.jasper.compiler.NewlineReductionServletWriter;

@WebServlet("/session")
public class SessionListenerTestServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		System.out.println("발급받은 session id : " + session.getId()); //발급받은 session id : 455FC22861EB7EC91EFD26AB5E9439C8
		
		session.setAttribute("username", "squirrel"); // session attribute 추가
		session.setAttribute("job", "teacher"); // session attribute 추가
		session.setAttribute("height", 900); // session attribute 추가
		
		session.setAttribute("username", "Suirrel"); // session attribute 수정
		
		session.removeAttribute("height"); // session attribute 삭제
		
		session.setAttribute("member", new MemberDTO("yein", "teacher", 900));
		
		session.invalidate(); // session 만료
	}
}
