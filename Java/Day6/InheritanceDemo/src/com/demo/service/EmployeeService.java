package com.demo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.beans.ContractEmp;
import com.demo.beans.SalariedEmp;

public class EmployeeService {
	static Employee[] emparr;
	static int count;
	static {
		emparr = new Employee[100];
		emparr[0] = new SalariedEmp(88888,"Rajan" ,"HR", "Designing", (2000,06,05));
		emparr[1] = new SalariedEmp(99999,"Revti", "UX", "Designer", (1999, 08, 07));
		emparr[2] = new ContractEmp;
		emparr[3] = new ContractEmp;
		count = 4;
	}

	public static boolean addNewEmployee(int ch) {
		Scanner sc = new Scanner(System.in);
		if (count < emparr.length) {
			System.out.println("Enter name: ");
			String nm = sc.next();

			System.out.println("Enter bdate: ");
			String bdate = sc.next();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date dt = null;
			try {
				dt = sdf.parse(bdate);
			} catch (ParseException e) {
				e.printStackTrace();
			}

			System.out.println("enter dept: ");
			String dept = sc.next();

			System.out.println("enter desg: ");
			String desg = sc.next();

			if (ch == 1) {
				System.out.println("enter salary");
				double sal = sc.nextDouble();
				emparr[count] = new SalariedEmp(nm, dt, dept, desg, sal);
				count++;
			}

			else if (ch == 2) {
				System.out.println("Enter hrs: ");
				float hrs = sc.nextFloat();

				System.out.println("Enter charges: ");
				double charges = sc.nextDouble();
				emparr[count] = new ContractEmp(nm, dt, dept, desg, hrs, charges);
				count++;

			}

			else {

			}

			return true;

		}
		return false;
	}

	public static void displayAll() {
		for(Employee emp: emparr) {
			if(emp!=null) {
				System.out.println(emp);
			}
		}
	}
	
	public static void displayonlySalariedEmp() {
		for(Employee emp :emparr) {
			if(emp != null && emp instanceof SalariedEmp) 
				System.out.println(emp);
		}		
		}
		
	public static void displayOnlyContractEmp() {
		for(Employee emp:emparr) {
			if(emp != null && emp instanceof ContractEmp) 
				System.out.println(emp);
			
		}
	
	}
	
	public static Employee searchById(String id) {
		for(Employee e:emparr) {
			if(e!=null) {
				if( e.getPid().equals(id)) {
					return e;
				}
			}
		}
		return null;
	}
	
	public static boolean modifyById(String id, double charges) {
		Employee e = searchById(id);
		if(e!=null) {
			if(e instanceof SalariedEmp) {
				((SalariedEmp)e).setSal(charges);
			}
			
			else if(e instanceof ContractEmp) {
				((ContractEmp)e).setCharges(charges);
			}
			
			else {
				//comments
			}
			
			return true;
			}
		
		return false;
		
	}
}
