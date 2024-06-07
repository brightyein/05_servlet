package com.ohgiraffers.filterwrapper.section02.uses;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;

public class RequestWrapper extends HttpServletRequestWrapper { // 인터페이스임
	
	public RequestWrapper(HttpServletRequest request) {
		super(request); // 부모의 생성자 호출해야 함 (감싸줄 대상을 인자로 받고 있기 때문에 인자지정해야 함)
	}
	
	@Override
	public String getParameter(String name) {
		
		String value = "";
		
		if("password".equals(name)) {
			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			value = passwordEncoder.encode(super.getParameter(name));
		} else {
			value = super.getParameter(name);
		}
		return value;
	}
}
