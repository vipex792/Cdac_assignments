package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;
import com.demo.service.ProjectService;
import com.demo.service.ProjectServiceImpl;

public class TestEmpProjCRUDDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ProjectService pservice = new ProjectServiceImpl();
		EmployeeService eservice = new EmployeeServiceImpl();

		int choice = 0;

		do {
			System.out.println("1. Add Project ");
			System.out.println("2. Add Employees");
			System.out.println("3. Show All Employees");
			System.out.println("4. delete Employees");
			System.out.println("5. update Employee Salary");
			System.out.println("6. Exit\nchoice: ");
			choice = sc.nextInt();

			switch (choice) {

			case 1 -> {
				pservice.addNewProject();
				
			}
			case 2 -> {
				boolean status = eservice.addNewEmployee();

				if (status) {
					System.out.println("Employee added successfully");
				}

				else {
					System.out.println("Employee not added.");
				}
			}
			
			case 3->{
				List<Employee> elist = eservice.getAllEmployee();
				elist.stream().forEach(System.out::println);
				
			}
			case 4->{
				System.out.println("Enter employee id");
				int empid=sc.nextInt();
				boolean status = eservice.deleteById(empid);
				if(status){
					System.out.println("Employee deleted succefully");
				}else {
					System.out.println("Not deleted");
				}
			}
			
			case 5->{
				System.out.println("Enter Emp id to update : ");
				int empid = sc.nextInt();
				
				System.out.println("Enter new salary : ");
				double sal = sc.nextDouble();
				
				System.out.println("Enter new name : ");
				String ename = sc.next();
				
				boolean status = eservice.updateEmployeeById(empid,ename,sal);
				
				if(status){
					System.out.println("Employee updated succefully");
				}else {
					System.out.println("Not updated");
				}	
			}
			
			case 6->{
				System.out.println("enter Employee id for adding project");
				int eid = sc.nextInt();
				System.out.println("Enter Project id to add");
				int pid = sc.nextInt();
				boolean status =eservice.addProjectToEmployee(eid,pid);
				if(status) {
					System.out.println("Employee updated succefully with project addition");
					
				}else {
					System.out.println("Not updated");
				}
				
			}
			case 7->{
				List<Employee> elist = eservice.SortEmployeeBySalary();
				elist.stream().forEach(System.out::println);
			}
			case 8->{
				sc.close();
				eservice.closeMySessionFactory();
				System.out.println("Thank you for visiting ....... ");
			}
			}

		} while (choice != 6);

	}

}
