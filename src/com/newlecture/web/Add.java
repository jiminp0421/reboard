package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class Add extends HttpServlet{

	protected void service(HttpServletRequest request,
			HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8"); 
	
		String x_ = request.getParameter("x");
		String y_ = request.getParameter("y");
	
		int x = 0;
		int y = 0;
	
		if(!x_.equals("")) x = Integer.parseInt(x_); //x값이 null이 아니라면 x_를 정수형으로 바꿔계산해라.
		if(!y_.equals("")) y = Integer.parseInt(y_);
		
		int result = x+y;
		
		resp.getWriter().printf("result is %d\n", result);
		
	}
}
