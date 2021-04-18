package com.newlecture.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class CharacterEncodingFilter implements Filter {

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest request
			, ServletResponse response
			, FilterChain chain)
			throws IOException, ServletException {

		request.setCharacterEncoding("UTF-8");//UTF-8로 받는것 //요청이 오면 실행
		
		chain.doFilter(request, response); //다음 실행을 관할, 조건 검사를 통해 다음 실행을 어디로 가게 할것인지 결정
		
		System.out.println("after Filter"); //결과를 실행
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {


	}

}
