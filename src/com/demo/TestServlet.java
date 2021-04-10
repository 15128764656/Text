package com.demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 接收表单数据
		String name=request.getParameter("name");
		String pwd=request.getParameter("pwd");
		//如果用户是admin登录成功
		if("admin".equals(name)){
			HttpSession session=request.getSession();
			session.setAttribute("name", name);
			response.sendRedirect("index.jsp");
		}else{
			response.sendRedirect("login.jsp");
		}
	}

}
