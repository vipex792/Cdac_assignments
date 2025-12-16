package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.bean.MyUser;

public class RegisterDaoImpl implements RegisterDao {

		static Connection conn=null;
	     static PreparedStatement reguser;
	     static {
	    	  
	    	 try {
	    		 conn=DBUtil.getMyConnection();
	    		 reguser=conn.prepareStatement("select uname,email,role from `user` where uname=? and password=?");
			} 
	    	 catch (SQLException e) {
			
				e.printStackTrace();
			}
	     }
	     

	@Override
	public MyUser regUser(String uname, String pass, String email, String mobile) {
		try {
			reguser.setString(1, uname);
			reguser.setString(2, pass);
			int rs=reguser.executeUpdate();
			if(rs.next()) {
				MyUser user=new MyUser(rs.getString(1),rs.getString(2),rs.getString(3));
				return user;
			}
		} 
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
		
		
	}


	@Override
	public MyUser regUser(String uname, String pass, String email, String mobile) {
		// TODO Auto-generated method stub
		return null;
	}
}
