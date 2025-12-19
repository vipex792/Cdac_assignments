package com.demo.MySpringbootDemo.service;

import com.demo.MySpringbootDemo.beans.MyUSer11;

public interface LoginService {

	MyUSer11 validateUser(String uname, String passwd);

}
