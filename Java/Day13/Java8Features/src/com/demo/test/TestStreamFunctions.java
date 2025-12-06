package com.demo.test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestStreamFunctions {

	public static void main(String[] args) {
		List<Integer> lst = List.of(23, 34, 45, 56, 67, 72, 14);

		// find max number
		Optional<Integer> maxnum = lst.stream().max(Integer::compare);
		System.out.println(maxnum.get());

		// find min number
		Optional<Integer> minnum = lst.stream().min(Integer::compare);
		System.out.println(minnum.get());

		// find max odd number
		maxnum = lst.stream().filter(e -> e % 2 != 0).max(Integer::compare);
		System.out.println(maxnum.get());

		// find 1st number > 5
		Optional<Integer> op = lst.stream().filter(e -> e > 5).findFirst();
		if (op.isPresent()) {
			System.out.println(op.get());
		}

		// to find the list of squares of all numbers
		List<Integer> lst1 = lst.stream().map(e -> e * e).collect(Collectors.toList());
		System.out.println(lst1);

		List<String> lstr = List.of("tt", "hh", "jj");

		Optional<String> op1 = lstr.stream().reduce((acc, s) -> acc.length() > s.length() ? acc : s);
		System.out.println(op1.get());
		
		
		//match functions
		boolean status = lst.stream().allMatch(e -> {
			System.out.println("all match " + e);
			return e > 15;
		});
		System.out.println(status);

		status = lst.stream().noneMatch(e -> {
			System.out.println("none match" + e);
			return e > 15;
		});
		System.out.println(status);

		status = lst.stream().anyMatch(e -> {
			System.out.println("any match" + e);
			return e > 15;
		});
		System.out.println(status);
	
		
	}

}
