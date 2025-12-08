package demo;
import java.util.Scanner;

public class Factfunc {
	public static int displayFact(int n) {
		
		if(n<=1) {
			return 1;
		}
		
		else {
			int f =1;
			for(int i=1;i<=n ; i++) {
				f*=i;
			}
			return f;
		}
	}
	
	
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		
		int ans = displayFact(n);
		System.out.println("Factorial is :" + ans);
		
		
	}
}
