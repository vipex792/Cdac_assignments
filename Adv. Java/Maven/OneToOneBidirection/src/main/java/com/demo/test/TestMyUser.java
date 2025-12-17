package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Address;
import com.demo.beans.MyUser;

public class TestMyUser {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Address a1 = new Address("AB street", "Nashik","670011");
		MyUser u1 = new MyUser(101,"Rohan","7777",a1);
		a1.setUser1(u1);
		Address a2 = new Address("Shankarnagar", "Raipur","492001");
		MyUser u2 = new MyUser(102,"Rohani","72277",a2);
		a2.setUser1(u2);
		
		session.save(u1);
		session.save(u2);
		session.save(a1);
		session.save(a2);
		tr.commit();
		session.close();
		sf.close();
		
		
		
	}

}
