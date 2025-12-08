package com.demo.search;

import com.demo.search.SearchingService;

public class SearchingService {

	// seq search for UNSORTED ARRAY
	public static int sequentialSearch(int[] arr, int search) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				return i;
			}
		}
		return -1;
	}

	// BINARY SEARCH for SORTED ARRAY
	// NON-RECURSIVE
	public static int binarySearchNonRecursive(int[] arr, int search) {
		int low = 0;
		int high = arr.length - 1;
		int cnt = 0;

		while (low <= high) {
			int mid = (low + high) / 2;
			cnt++;

			if (arr[mid] == search) {
				System.out.println("comparisons are : " + cnt);
				return mid;
			}

			if (search < arr[mid]) {
				high = mid - 1;
			}

			else {
				low = mid + 1;
			}
		}

		System.out.println("comparisons are " + cnt);
		return -1;
	}
	
	
	//BINARY SEARCH RECURSIVE
	public static int binarySearchRecurssive(int [] arr , int search, int low, int high) {
		System.out.println("binary search recurssive"+low +"-----"+ high);
		
		
		if(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid]==search) {
				return mid;
				
			}
			else if(search<arr[mid]){
				return binarySearchRecurssive (arr, search, low, mid-1);
			}
			else {
				return binarySearchRecurssive (arr, search, mid+1,high);
			}
			
		}
		return -1;
		
	}
	
}



