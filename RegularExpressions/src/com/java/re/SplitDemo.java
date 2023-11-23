package com.java.re;

import java.util.regex.Pattern;

public class SplitDemo {

	public static void main(String[] args) {

		Pattern pattern = Pattern.compile("\\-");
		String[] strs = pattern.split(
				"https://www.businesstoday.in/latest/trends/story/cricket-world-cup-2023-becomes-most-attended-icc-event");

		for (String word : strs) {
			System.out.println(word);
		}

		System.out.println("\n\n");

		String sentence = "https://www.businesstoday.in/latest/trends/story/cricket-world-cup-2023-becomes-most-attended-icc-event";
		String[] strs2 = sentence.split("[.]");

		for (String word : strs2) {
			System.out.println(word);
		}
	}
}
