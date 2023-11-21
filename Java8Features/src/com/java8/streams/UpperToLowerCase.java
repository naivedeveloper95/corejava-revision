package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UpperToLowerCase {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("JOHN");
		list.add("BHARAT");
		list.add("JIM");

		List<String> lowercasedList = list.stream().map(e -> e.toLowerCase()).collect(Collectors.toList());
		System.out.println(lowercasedList);

		long lowercasedListCount = list.stream().map(e -> e.toLowerCase()).count();
		System.out.println(lowercasedListCount);

		List<String> lowercasedListSorted = list.stream().map(e -> e.toLowerCase()).sorted()
				.collect(Collectors.toList());
		System.out.println(lowercasedListSorted);
	}

}
