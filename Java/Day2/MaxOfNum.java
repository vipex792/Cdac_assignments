import java.util.Scanner;

class MaxOfNum{
	public static void main (String args []){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the number");
	int n1 = sc.nextInt();
	int n2 = sc.nextInt();
	int n3 = sc.nextInt();
	
	if((n1==n2) && (n1==n3)){
	System.out.println("All numbers are equal");
	}
	
	if((n1>n2) && (n1>n3)){
	System.out.println(n1 + " is largest no.");
	}
	
	if((n2>n1) && (n2>n3)){
	System.out.println(n2 + " is largest no.");
	}
	
	else
	{ 
		System.out.println(n3 + " is largest no.");

	}
	
	}
}