package com.demo.service;

import com.demo.bean.MyUser;
import com.demo.dao.RegisterDao;
import com.demo.dao.RegisterDaoImpl;

public class RegisterServiceImpl implements RegisterService{
	private RegisterDao rdao;
	
	public RegisterServiceImpl() {
		rdao=new RegisterDaoImpl();
		
		
	}
	

	@Override
	public MyUser registerUSer(String uname, String pass, String email, String mobile) {
		
		return rdao.regUser(uname,pass,email,mobile);
	}

}
