package com.demo.bean;

public class MyUser {
private String uname;
private String email;
private String role;
private String pass;
private String mobile;
public MyUser() {
	super();
}

public MyUser(String uname, String email, String role, String pass, String mobile) {
	super();
	this.uname = uname;
	this.email = email;
	this.role = role;
	this.pass = pass;
	this.mobile = mobile;
}

public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}


public String getPass() {
	return pass;
}

public void setPass(String pass) {
	this.pass = pass;
}

public String getMobile() {
	return mobile;
}

public void setMobile(String mobile) {
	this.mobile = mobile;
}

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}

@Override
public String toString() {
	return "MyUser [uname=" + uname + ", email=" + email + ", role=" + role + ", pass=" + pass + ", mobile=" + mobile
			+ "]";
}



}
