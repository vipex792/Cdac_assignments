package demo;
import java.util.Scanner;

public class ArrayService {

	public static void acceptData(int [] arr){
		Scanner sc = new Scanner(System.in);
		for(int i =0; i<arr.length ; i++) {
			System.out.println("Enter the array elements : ");
			arr[i] = sc.nextInt();
					}
	}
	
	public static int findMinNum(int [] arr) {
		int min = arr[0];
		for(int i = 1; i<arr.length; i++) {
			if(min>arr[i]) {
				min = arr[i];
			System.out.println("the minimum value is "+ min);
			}
			
		}
		
		return min;
	}
	
	
	public static int findMaxNum(int [] arr) {
		int max = arr[0];
		for(int i = 1; i<arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			System.out.println("the maximum value is "+ max);
			}
			
		}
		return max;
		
		
		
	}
	
	public static int searchByValue(int [] arr, int f) {

		for(int i = 0;i<arr.length ; i++) {
			if(f==arr[i]) {
				return i;
			}
			
		}
		return -1;
	}
	
	public static void displayData(int [] arr) {

		for(int i = 0;i<arr.length; i++) {
			System.out.print(i+"  "+arr[i]+"  ");
		}
		System.out.println( "---------------------");

	
	
}
 public static int adddata(int arr[]) {
	 
	int sum = 0;
	 for(int i = 0; i<arr.length;i++) {
		 sum=sum+arr[i];
	 }
	 return sum;
 }
 
 
public static int[] findAllOccurences(int arr [],int num) {
	int[]temp = new int [arr.length];
	for(int i =0; i<temp.length; i++) {
		temp[i]= -1;
	}
	int cnt = 0;
	for(int i = 0; i<arr.length; i++) {
		if(arr[i] ==num) {
			temp [cnt] = i;
			cnt++;
		}
		}
		if(cnt>0) {
		return temp;
		}
	return null;
}
 
 
 
 
}
 
	