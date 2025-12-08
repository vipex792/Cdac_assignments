package com.demo.test;

import com.demo.sorting.QuickSortAlgorithm;

public class TestQuickSort {

	public static void main(String[] args) {
		int [] arr = {1,4,56,39,33,78,61,3,34,98};
		QuickSortAlgorithm.quickSort(arr, 0, arr.length-1);
	}

}
