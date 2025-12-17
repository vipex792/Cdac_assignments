package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Address;
import com.demo.beans.MyUser;

public class TestMyuserGetData {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		System.out.println("before get");
		MyUser u1 = session.get(MyUser.class,12);
		Address a1 = session.get(Address.class,10);
		System.out.println("after get");
		System.out.println(u1);
		System.out.println(a1);
		System.out.println(a1.getUser1());
		
		
		
		
		tr.commit();
		session.close();
		sf.close();
		

	}

}
