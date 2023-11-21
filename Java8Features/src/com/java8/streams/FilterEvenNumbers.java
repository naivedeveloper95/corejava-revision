package com.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			list.add(i);
		}

		System.out.println(list);
//		List<Integer> evenList = new ArrayList<Integer>();
//		for (Integer item : list) {
//			if (item % 2 == 0) {
//				evenList.add(item);
//			}
//		}
		List<Integer> evenList = list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
		System.out.println(evenList);

		Comparator<Integer> comp = (i1, i2) -> i1.compareTo(i2);
		List<Integer> sortedUsingComparator = list.stream().sorted(comp).collect(Collectors.toList());

		System.out.println(sortedUsingComparator);

		Integer max = list.stream().max(comp).get();
		System.out.println(max);

		Integer min = list.stream().min(comp).get();
		System.out.println(min);

		list.stream().forEach(e -> System.out.println(e));
	}
}
