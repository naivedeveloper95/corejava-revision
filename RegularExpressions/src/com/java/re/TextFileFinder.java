package com.java.re;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextFileFinder {

	public static void main(String[] args) {

		File directory = new File("D:\\Code");

		String[] fileNames = directory.list();
		Pattern pattern = Pattern.compile("[a-zA-Z0-9]+[.]txt");
		int count = 0;

		for (String file : fileNames) {
			Matcher matcher = pattern.matcher(file);

			if (matcher.matches()) {
				count++;
				System.out.println(file);
			}
		}

		System.out.println("Number of text file is " + count);
	}

}
