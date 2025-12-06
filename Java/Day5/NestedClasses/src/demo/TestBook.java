package demo;

public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book();
		Book.Lesson l1 = b1.new Lesson();
		l1.m1(); 
		
		Book b2 = new Book(101,"testing",34,"lesson1" );
		System.out.println(b1);
		b2.getL1().m1();
	}

}

