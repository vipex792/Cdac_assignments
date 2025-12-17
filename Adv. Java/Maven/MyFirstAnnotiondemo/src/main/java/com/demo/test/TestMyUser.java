package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.MyUser;
import com.demo.beans.Product7;

public class TestMyUser {
	public static void main(String [] args) {
	SessionFactory sf = new Configuration().configure().buildSessionFactory();
	Session session = sf.openSession();
	Transaction tr = session.beginTransaction();

	MyUser u1 = new MyUser(300,"Revati", "rr@gmail.com");
	MyUser u2 = new MyUser(400,"Rahul","ra@gmail.com");
	Product7 p1 = new Product7("lays",12,30);
	Product7 p2 = new Product7("cadbury",10,100);
	
	session.save(u1);
	session.save(u2);
	session.save(p1);
	session.save(p2);
	
	tr.commit();
	session.close();
	sf.close();
	
	}
}
