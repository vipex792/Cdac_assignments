package com.demo.test;
import com.demo.arrays.MyArray;

public class TestArray{
	
	public static void main(String [] args) {
		
		MyArray ob = new MyArray();
		//everything you are supposed to do with object ob only
		System.out.println("capacity : " + ob.getCapacity());
		//not have incremented anything
		System.out.println("size : " + ob.getSize());
		
		
		ob.add(4);
		ob.add(5);
		ob.add(67);
		ob.add(29);
		ob.add(27);
		ob.add(32);
		ob.add(101);
		
		System.out.println("size after addition : " + ob.getSize());
		System.out.println(ob);


		System.out.println("Index of "+ ob.searchByValue(67));
		System.out.println(ob);
		

		ob.add(23,1);
		System.out.println(ob);
		
		ob.deleteByPos(1);
		System.out.println(ob);
		


	}
			
			
}