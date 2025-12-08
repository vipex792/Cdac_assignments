package com.demo.test;

import java.util.Date;
import java.util.Scanner;

import com.demo.beans.ContractEmp;
import com.demo.beans.SalariedEmp;
import com.demo.beans.Employee;
public class TestEmployee {

	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Salaried \n 2. Contract");
		int choice = sc.nextInt();
		Employee e1 = null;
		Employee e2 = null;
		
		switch (choice) {
		case 1:
			e1 = new SalariedEmp("Rajan", new Date(2000,04,23), "HR", "Designer");
			e2 = new SalariedEmp("Arti", new Date(2000,04,23),"UX", "Designer");
			
			break;
			
		case 2:
			e1 = new ContractEmp
		}
		
	}
}
