package com.demo.test;

import java.util.Scanner;

import com.demo.exceptions.NegativeSalaryException;

public class TestException1 {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i =0 ; i<3 ;i++) {
			try {
				System.out.println("Enter the salary : ");
				double sal = sc.nextDouble();
				
				if(sal<0) {
					throw new NegativeSalaryException("Salary cant be neg.");
				}
				
				System.out.println("Salary : " + sal);
				break;
			}
			
			catch(NullPointerException e) {
				System.out.println(e.getMessage());
			}
			
			catch(NegativeSalaryException e) {
				e.printStackTrace();
				
				
			}
			
			
		}
		
	}
}