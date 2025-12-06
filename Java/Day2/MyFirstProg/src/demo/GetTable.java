package demo;
import java.util.Scanner;

public class GetTable {
	public static void printTable(int n) {
		for(int i = 1; i<=10 ; i++) {
			System.out.println(n + "*" + i +  "  " + " = " + (n*i));
		}
		
	}
	
public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter number : ");
		//int n = sc.nextInt();
		
		
	
		if(args.length<=0) {
			System.out.println("Atleast pass 1 parameter");
		}
		
		else {
//			System.out.println(Integer.parseInt(args [0]));
			printTable(Integer.parseInt(args[0]));
		}
	}
		
	

}
