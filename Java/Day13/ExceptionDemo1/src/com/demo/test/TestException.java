package com.demo.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException {
	private static int divide(int x, int y) {
		return x / y;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter a number 1 : ");
			int num1 = sc.nextInt();

			System.out.println("Enter a number 2 : ");
			int num2 = sc.nextInt();

			int ans = divide(num1, num2);
			System.out.println("Division : " + ans);

			System.out.println("At the end of try block");
		}

		catch (InputMismatchException e) {
			System.out.println("Pls enter number : ");
		}

		catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

		catch (Exception e) {
			System.out.println("error occured");
			System.out.println(e.getMessage());
		}

		finally {
			System.out.println("In finally block");

		}

	}
}