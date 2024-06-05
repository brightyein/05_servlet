package com.yein.practice0605;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/reservation")
public class Practice extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int seat = Integer.parseInt(request.getParameter("seat"));
		
		if (seat == 0) {
			response.sendError(404, "요청하신 좌석수의 예약은 불가합니다.");
		}
		
		String movie = request.getParameter("movie");
		System.out.println("예매한 영화 : " + movie);
		
		System.out.println("예매한 좌석 수 : " + seat);
		
		System.out.println("결제 금액 : " + 9000 *Integer.parseInt(request.getParameter("seat")) + " 원");
		
		PrintWriter out = response.getWriter(); 
		response.setContentType("text/html; charset=UTF-8");
		out.print("예매하신 영화는 < " + movie + " > 이고, 좌석수는 < " + seat + " > 석 입니다.\n");
		out.print("총 < "+ 9000 *Integer.parseInt(request.getParameter("seat")) + " > 원 결제가 완료되었습니다.\n");
		out.print("즐거운 관람되십시오!");
		out.close();
	
	}
}
