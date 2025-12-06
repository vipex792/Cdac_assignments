package com.demo.test;

import java.util.Scanner;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;
public class TestCrudDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		EmployeeService eservice = new EmployeeServiceImpl();
		eserivce.readFile("empdata1.txt");
		int choice = 0;
		do {
			System.out.println("1. add new Employee\n2. delete by Id\n");
			System.out.println("3. modify by id\n4. Display All\5. display by id\n6. exist\nchoice:");
		choice= sc.nextInt();
		switch (choice ) {
		case 1->{
			boolean status = eservice.addNewEmployee();
			if(status) {
				System.out.println("Employee is Added Succefully");
				
			}else {
				System.out.println("Not Added ");
			}
			
		}
		case 2->{
			System.out.println("Enter id");
			int empid = sc.nextInt();
			boolean status = eservice.deleteById(empid);
			if(status) {
				System.out.println("deleted Succefully");
			}else {
				System.out.println("Not Found");
			}
			
		}
case 3->{
			
		}
case 4->{
	
}
case 5->{
	
}
case 6->{
	
}

		}
		}
	}

}
