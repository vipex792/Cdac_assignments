package demo;

import java.util.Scanner;

public class AddNumbers {
	public static void main (String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter numbers : ");
			
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
			int sum = n1 + n2;
			System.out.println("Sum of numbers is : "  + sum );
	}
}
