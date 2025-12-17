package com.demo.test;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Product12;

public class TestMyUSerGetData {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		//retrieve the product
		Product12 p=session.get(Product12.class, 3452);
		Product12 p1=session.get(Product12.class, 3453);
		tr.commit();
		System.out.println(p);
		
		System.out.println(p1);
		session.close();
		sf.close();
		

	}

}
