package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.bean.MyUser;
import com.demo.service.LoginService;
import com.demo.service.LoginServiceImpl;

@WebServlet ("/validateuser")
public class LoginServlet extends HttpServlet {
private static final long serialVersionUID = 1L;

 
protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
	res.setContentType("text/html");
	PrintWriter out = res.getWriter();
	String pass = req.getParameter("pass");
	String uname = req.getParameter("uname");
	LoginService lservice = new LoginServiceImpl();
	MyUser user =lservice.validateUSer(uname,pass);
	
	 
	if(user!=null) {
		HttpSession session=req.getSession();
		session.setAttribute("user", user);
		RequestDispatcher rd = req.getRequestDispatcher("showproduct");
		rd.forward(req,res);
	}
	
	else {
		out.print("<h1>Invalid credentials </h1>");
		RequestDispatcher rd = req.getRequestDispatcher("Login.html");
		 rd.include(req, res);
	}
	
}
}
