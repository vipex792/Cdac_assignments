package com.demo.dao;

import com.demo.bean.MyUser;

public interface RegisterDao {

	MyUser regUser(String uname, String pass, String email, String mobile);
	

}
