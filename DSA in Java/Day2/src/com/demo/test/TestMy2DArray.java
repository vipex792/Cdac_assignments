package com.demo.test;

import com.demo.arrays.My2DArray;
import java.util.stream.IntStream;
public class TestMy2DArray {

	public static void main(String[] args) {
		My2DArray ob1 = new My2DArray();
		My2DArray ob2 = new My2DArray();
//		My2DArray ob2 = new My2DArray(2,2);
		ob1.acceptData();
		ob1.displayData();
		ob2.acceptData();
		
		//row rotation
		ob1.rowRotation(true, 1);
		ob1.displayData();
		ob1.rowRotation(false, 0);
		ob1.displayData();
		
		//column rotation
		ob1.columnRotation(true, 1);
		ob1.displayData();
		ob1.rowRotation(false, 0);
		ob1.displayData();
		
		//transpose matrix
		int [][] arr= ob1.transpose();
		displayarray(arr);
		
		//check for symmetric or not
		
		if(ob1.isSymmetric()) {
			System.out.println("Symmetric matrix: ");
			
		}else {
			System.out.println("not a symmetric matrix");
		}
		
		//check is identity or not
		if(ob1.isIdentity()) {
			System.out.println("Identity matrix ");
		}else {
			System.out.println("not Identity matrix");
		}
		
		

	}

	private static void displayarray(int[][] arr) {
		// TODO Auto-generated method stub
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0;j< arr[0].length;j++) {
				System.out.println(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	

}
