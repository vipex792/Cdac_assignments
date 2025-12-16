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
import com.demo.service.RegisterService;
import com.demo.service.RegisterServiceImpl;

@WebServlet ("/registeruser")
public class RegisterServlet extends HttpServlet {
private static final long serialVersionUID = 1L;

 
protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
	res.setContentType("text/html");
	PrintWriter out = res.getWriter();
	String pass = req.getParameter("pass");
	String uname = req.getParameter("uname");
	String email = req.getParameter("email");
	String mobile = req.getParameter("mobile");
	
	
	if(uname==null || uname.trim().isEmpty() ||
			   pass==null  || pass.trim().isEmpty() ||
			   email==null || email.trim().isEmpty() ||
			   mobile==null || mobile.trim().isEmpty()) {
			    
			    out.print("<h3 style='color:red;'>All fields are required! Please fill everything.</h3>");
			    RequestDispatcher rd = req.getRequestDispatcher("register.jsp");
			    rd.include(req, res);
			    return;                     // stop further processing
			}

	RegisterService rservice = new RegisterServiceImpl();
	MyUser user =rservice.registerUSer(uname,pass,email,mobile);
	
	 
	if(user != null) {
	    HttpSession session = req.getSession();
	    session.setAttribute("user", user);
	    
	    // Directly forward to Login.jsp (or Login page)
	    RequestDispatcher rd = req.getRequestDispatcher("Login.jsp");
	    rd.forward(req, res);
	}
	
	else {
	    out.print("<h3>Registration Failed! Username or Email already exists.</h3>");
	    RequestDispatcher rd = req.getRequestDispatcher("register.jsp");
	    rd.include(req, res);
	}
	
}
}
