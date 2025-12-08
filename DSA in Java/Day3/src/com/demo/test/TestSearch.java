package com.demo.test;

import com.demo.search.SearchingService;

public class TestSearch {

	public static void main(String[] args) {
		int[] arr = { 2, 6, 4, 8, 23, 56, 44, 98, 34, 15 };

		int pos = SearchingService.sequentialSearch(arr, 15);
		if (pos != -1) {
			System.out.println("Value found at this position in seq search" + pos);
		} else {
			System.out.println("Value");
		}

		int[] arr1 = { 12, 13, 16, 23, 27, 45, 56, 58, 62, 65, 70 };
		pos = SearchingService.binarySearchNonRecursive(arr1, 15);
		if (pos != -1) {
			System.out.println("binary search number found at position : " + pos);
		} else {
			System.out.println("binary search number not found");
		}

		pos = SearchingService.binarySearchRecurssive(arr1, 15, 0, 10);
		if (pos != -1) {
			System.out.println("binary search number found at position : " + pos);
		} else {
			System.out.println("binary search number not found");
		}
	}

}
