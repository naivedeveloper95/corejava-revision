package com.java.re;

public class StringPhoneValidator {

	public static void main(String[] args) {

		String phone = "1234567890";

		if (phone.matches("^\\d{10}$")) {
			System.out.println("Valid phone number.");
		} else {
			System.out.println("Invalid phone number.");
		}
	}

}
