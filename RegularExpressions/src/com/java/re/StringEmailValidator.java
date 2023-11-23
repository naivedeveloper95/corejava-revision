package com.java.re;

public class StringEmailValidator {

	public static void main(String[] args) {

		String email = "satyam@foobar.com";

		if (email.matches("^[a-zA-Z0-9_.-]+@[a-zA-Z0-9_.-]+$")) {
			System.out.println("Valid email id.");
		} else {
			System.out.println("Invalid email id.");
		}
	}

}
