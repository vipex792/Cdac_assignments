package com.demo.test;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestClass {

	public static void main(String[] args) {
		List<Integer> lst = List.of(3,4,5,6,67,15,23,55,1);
		
		Predicate<Integer> p1 = e->e<10;
		lst.stream().filter(p1).forEach(System.out::println);
		
		
		Supplier<String> s=()-> {String [] str= {"hello" , "welcome" , "greet"};
		
		int x = (int) Math.random()*2+1;
		
		return str[x];
			};
			
			//This prints string element whenever we write below statements
			System.out.println(s.get());
			System.out.println(s.get());
			System.out.println(s.get());

	}}
