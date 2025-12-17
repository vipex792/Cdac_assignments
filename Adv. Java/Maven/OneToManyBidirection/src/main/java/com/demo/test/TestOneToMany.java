package com.demo.test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Department;
import com.demo.beans.Employee;

public class TestOneToMany {

	public static void main(String[] args) {

		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session session = sf.getCurrentSession();
		Transaction tr = session.beginTransaction();
		
		Department d = new Department(120,"Gaming","pune");
		Department d1 = new Department(130,"Calling","Mumbai");
		Employee e1 = new Employee(050,"Nishant",LocalDate.of(2020, 06, 10),5000,d);
		Employee e2 = new Employee(110,"Minal",LocalDate.of(2015, 10, 07),10000,d);
		Employee e3 = new Employee (120,"Rupali",LocalDate.of(2016, 06, 12),25000,d1);
		Employee e4 = new Employee(140,"Ashwini", LocalDate.of(2025, 03, 15), 3000,d1);
		
		Set<Employee> set1=new HashSet<>();
		set1.add(e1);
		set1.add(e2);
		
		
		Set<Employee> set2=new HashSet<>();
		set2.add(e3);
		set2.add(e4);
		d.setEset(set1);
		d1.setEset(set2);
		session.save(d);
		session.save(d1);
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);
		
		
		tr.commit();
		session.close();
		sf.close();
	}

}
