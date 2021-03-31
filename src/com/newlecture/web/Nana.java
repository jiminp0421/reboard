package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hi")
public class Nana extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {
		
	 
	resp.setCharacterEncoding("UTF-8");	//UTF-8로 보내는것
	resp.setContentType("text/html; charset=UTF-8"); //브라우저에게 요대로 해석해라
	PrintWriter out = resp.getWriter();
	 
	String temp = req.getParameter("cnt");
	
	int cnt_ = 0;
	
	if(temp != null && !temp.equals(""))
		cnt_ = Integer.parseInt(temp);
	
	 for(int i=0; i<cnt_; i++) {
		 out.println((i+1)+": 안녕 Servlet!");
	 }
	}
}
