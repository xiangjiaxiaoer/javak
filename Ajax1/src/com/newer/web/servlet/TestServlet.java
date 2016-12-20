package com.newer.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Userinfo;

import dao.Userdao;
@WebServlet(name="test",urlPatterns="/test")
public class TestServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO 自动生成的方法存根
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		  throws ServletException, IOException {
		  req.setCharacterEncoding("UTF-8");
		  resp.setContentType("text/html;charset=UTF-8");
		  
          PrintWriter out=resp.getWriter();
		  
		 String username=req.getParameter("username1");
		 Userdao dao=new Userdao();
		 String  user=dao.selectuser(username);
			 
		 if(username.equals(user)){
			 out.println("用户名重复");
		 }else{
			 out.println("用户可以注册");
		 }
		   
	}
     
}
