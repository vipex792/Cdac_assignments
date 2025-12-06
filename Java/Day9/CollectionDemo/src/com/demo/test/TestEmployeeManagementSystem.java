package com.demo.test;

import java.util.Scanner;
import java.util.List;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;



public class TestEmployeeManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		EmployeeService eservice = new EmployeeServiceImpl();
		
		int choice=0;
		
		
		do {
			
			System.out.println("1. Add new employee\n 2. Display all\n 3.Search By Id");
			System.out.println("4. Search by Name\n 5. Update Salaray\n 6. delete by Id\n 7.delete By Salary ");
			
			System.out.println("8. Search By salary\n 9. sort by Salary\n 10. sort By Name\n 11. exit\n choice: ");
			choice = sc.nextInt();
			
			
			switch(choice) {
			
			case 1->{
				boolean status = eservice.addNewEmployee();
				if(status) {
					System.out.println("Added Succesfully");
				}
				else {
					System.out.println("Not Found");
				}
			}
			
			
			case 2->{
				List<Employee> elist = eservice.displayAll();
				//display the data
				elist.forEach(System.out::println);
				
				
			}
			
			case 3->{
				System.out.println("Enter search by id: ");
				int eid = sc.nextInt();
				Employee e=eservice.searchById(eid);
				if(e!=null) {
					System.out.println(e);
				}
				else {
					System.out.println("Not Found");
				}
				
				
			}
			
			case 4->{
				System.out.println("Enter name for searching.");
				String nm = sc.next();
				List<Employee> elst = eservice.findByName(nm);
				if(elst!=null) {
					elst.forEach(System.out::println);
				}
				else {
					System.out.println("not found");
				}
			}
			
			case 5->{
				System.out.println("Enter by id");
				int eid =sc.nextInt();
				System.out.println("Enter salary :");
				double sal = sc.nextDouble();
				boolean status =eservice.updateById(eid,sal);
				if(status) {
					System.out.println("updated successfully .");
				}
				else {
					System.out.println("Not found");
				}
			}
			
			
			case 6->{
				System.out.println("Enter the id");
				int eid = sc.nextInt();
				boolean status = eservice.deleteById(eid);
				if(status) {
					System.out.println("Deleted Successfully");
				}
				
				else {
					System.out.println("Not found");
				}
			}
			
			case 7->{
				System.out.println("Enter the salary: ");
				double sal = sc.nextDouble();
				boolean status = eservice.deleteBySalary(sal);
				if(status) {
					System.out.println("Deleted Salary Successfully");
				}
				else {
					System.out.println("not found!!");
				}
			}
			
			case 8->{
				System.out.println("Enter the Salary ");
				double sal= sc.nextDouble();
				List<Employee> elist = eservice.searchBySal(sal);
						if(elist!=null) {
							elist.forEach(System.out::println);
						}
						else {
							System.out.println("Not Found");
						}
				
			}
			
			case 9->{
				List<Employee> lst=eservice.sortBySal();
				lst.forEach(System.out::println);
			}
			
			case 10->{
				List<Employee> lst = eservice.sortByName();
				lst.forEach(System.out::println);
				
			}
			
			case 11->{
				System.out.println("Thankyou for visiting...");
				
			}
			
			default->{
				System.out.println("Wrong Choice");
				
			}
			
			
			}
		}
		
		while(choice!=11);

	}

}
