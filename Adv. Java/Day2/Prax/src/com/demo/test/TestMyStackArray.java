package com.demo.test;

import com.demo.stacks.MyStackArray;

public class TestMyStackArray {

	public static void main(String[] args) {
		MyStackArray ob = new MyStackArray();
		ob.push(93);
		ob.push(6);
		ob.push(6);
		ob.push(6);
		ob.push(6);
		ob.push(6);
		System.out.println("Stack is Printed");
		System.out.println(ob.pop()+"POP ELEMENT");
		System.out.println(ob.pop());
		
	}

}
