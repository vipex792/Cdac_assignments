package com.demo.arrays;

import java.util.Arrays;

public class MyArray {
	// First make data members that too pvt
	private int[] arr;
	private int count;

	// constructor functions
	public MyArray() {
		arr = new int[10];
		count = 0;
	}

	public MyArray(int[] arr, int count) {
		this.arr = arr;
		this.count = count;

	}

	public MyArray(int size) {
		arr = new int[size];
		count = 0;
	}

	public int getCapacity() {
		return arr.length;
	}

	public int getSize() {
		return count;
	}

	// addition
	public boolean add(int x) {
		if (count < arr.length) {
			arr[count] = x;
			count++;
			return true;
		}
		return false;
	}

	// value addition at given pos
	public boolean add(int value,int pos) {
		if(count<arr.length && pos<count) {
			for(int i =count ; i>pos ; i--) {
				arr[i]=arr[i-1];
			}
			arr[pos]=value;
			count++;
			return true;
		}
		return false;
	}
	
	//delete by pos
	public boolean deleteByPos(int pos) {
		if(pos<count) {
			//overwriting the values
			for(int i=pos;i<count-1;i++) {
				arr[i]=arr[i+1];
			}
			arr[count-1]=0;
			count--;
			return true;
		}
		
		return false;
	}
	
	//search by value
	public int searchByValue(int value) {
		for(int i = 0; i < count; i++) {
			if (arr[i] == value) {
				return i;
			}

		}
		return -1;

	}

	// displaying array
	public String toString() {
		return "MyArray is [ " + Arrays.toString(arr) + " ]";
	}

}