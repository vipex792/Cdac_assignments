import java.util.Scanner;

class AddNumbers{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	

	if(n1>n2){
	System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
	}

	}
}