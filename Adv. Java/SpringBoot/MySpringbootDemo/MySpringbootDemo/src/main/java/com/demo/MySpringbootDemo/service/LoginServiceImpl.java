package com.demo.MySpringbootDemo.service;

import org.springframework.stereotype.Service;

//import com.demo.MySpringbootDemo.beans.MyUSer;
import com.demo.MySpringbootDemo.beans.MyUSer11;

@Service
public class LoginServiceImpl implements LoginService{
	 // @Autowired
     // LoginDao ldao;
	
	public MyUSer11 validateUser(String uname, String passwd) {
		//return ldao.autheticateUser(uname,passwd);
		return null;
	}

}