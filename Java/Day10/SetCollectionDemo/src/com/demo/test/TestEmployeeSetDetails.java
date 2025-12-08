package com.demo.test;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestEmployeeSetDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService eservice = new EmployeeServiceImpl();

		int choice = 0;

		do {
			System.out.println(" 1. Add new Employee\n 2.Display all\n 3.Search by ID\n");
			System.out.println("4. Search by name \n 5.Update salary \n 6.Delete by ID \n 7.Delete by Salary\n");
			System.out.println("8. Search by salary\n 9.Sort by salary \n 10. Sort by name\n 11.Sort by ID. 12. exit \n choice :");

			choice = sc.nextInt();
			switch (choice) {
			
			case 1 -> {
				boolean status = eservice.addNewEmployee();
				if(status) {
					System.out.println("Employee added Successfully!!");
				}
				
				else {
					System.out.println("Duplicate id,Not found");
				}
			}
			

			case 2 -> {
				Set<Employee> eset = eservice.displayAll();
				eset.forEach(System.out::println);

			}
 
			case 3 -> {
				System.out.println("Enter Id :");
				int id = sc.nextInt();
				Employee e = eservice.displayById(id);
				
				if(e!=null) {
					System.out.println(e);
				}
				else {
					System.out.println("not found");
				}
			}
			

			case 4 -> {
				System.out.println("enter name");
				String nm = sc.next();
			Set<Employee> eset=	eservice.displayByName(nm);
			if(eset!=null) {
				eset.forEach(System.out::println);
				
			}
			else {
				System.out.println("not found");
			}
				
			}
			

			case 5 -> { 
				System.out.println("enter id");
				int id = sc.nextInt();
				
				System.out.println("enter sal");
				double sal = sc.nextDouble();
				
				boolean status = eservice.updateBySal(id,sal);
				if(status) {
					System.out.println("updated Succesfully");
				}
				else {
					System.out.println("not Found");
				}
				
			}

			
			case 6 -> {
				System.out.println("Enter ID to Delete");
				int id = sc.nextInt();
				
				boolean status = eservice.deleteById(id);
				if(status) {
					System.out.println("Deleted Successfully");
					
				}
				else {
					System.out.println("Not Found ID");
				}

			}
 
			
			case 7 -> {
				System.out.println("Enter Salary : ");
				double sal = sc.nextDouble();
				boolean status = eservice.deleteBySal(sal);
				if(status) {
					System.out.println("Deleted Successfully:");
					
				}
				else {
					System.out.println("Not Found");
				}
			}
			
 
	
			case 8 -> { 
				System.out.println("Enter Salary :");
				double sal = sc.nextDouble();
				Employee e = eservice.displayBySal(sal);
				
				if(e!=null) {
					System.out.println(e);
				}
				else {
					System.out.println("not found");
				}
				
				
				
			}
			

			case 9 -> {
				List<Employee> elist =eservice.sortBySal();
				elist.forEach(System.out::println);

			}

			case 10 -> {
				List<Employee> elist = eservice.sortByName();
				elist.forEach(System.out::println);

			}

			case 11 -> {
				Set<Employee> eset = eservice.sortById();
				eset.forEach(System.out::println);
			}

			case 12 -> {

			}

			}

		}

		while (choice != 12);
	}

}
