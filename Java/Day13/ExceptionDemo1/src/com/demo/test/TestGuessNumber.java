package com.demo.test;
import java.util.Scanner;

import com.demo.exceptions.WrongNumberException;
public class TestGuessNumber {

	public static void main(String[] args) {
		int num = 45;
		Scanner sc =new Scanner (System.in);
		while(true) {
			try {
				System.out.println("Enter a number :");
				int num1 = sc.nextInt();
				if(num==num1) {
					System.out.println("Yeppe!! you guess the right number");
				break;
				}
				else {
					if(num1<num)
					throw new WrongNumberException("Oohhh!! , you guess the smaller number");
					else
						throw new WrongNumberException("Ohhh!! , it is greater number");
				}
				
			}
			catch(WrongNumberException e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
