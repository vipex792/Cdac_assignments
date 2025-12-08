package demo;
public class CommandLineDemo {
	public static void main(String args []) {
		System.out.println("Number of arguments : " + args.length);
		
		if(args.length<=0) {
		System.out.println("Error: Atleast pass one parameter ");
		}
		else {
			for(int i = 0; i<args.length; i++) {
				System.out.println("Hello "+args[i]);
			}
		}
	}
}

