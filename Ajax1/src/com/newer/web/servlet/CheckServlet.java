package com.newer.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="check",urlPatterns="/check")
public class CheckServlet extends HttpServlet{

	/**
	 * 
	 */


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO �Զ����ɵķ������
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		  req.setCharacterEncoding("UTF-8");
		  resp.setContentType("text/html;charset=UTF-8");
		  PrintWriter out=resp.getWriter();
		  
		  String username=req.getParameter("username");
		  String pwd=req.getParameter("pwd");
		 //String result=null;
		  if("admin".equals(username)&&"123".equals(pwd)){
			  out.println("��¼�ɹ�!");
		  }else{
			  out.println("�û��������û��������!");
		  }	  	  
			//req.setAttribute("result", result);
			//req.getRequestDispatcher("index.jsp").forward(req, resp);
		  
	}
   
}
