package com.java8.methodref.constructors;

public class MyClass {

	private String s;

	public MyClass(String s) {
		this.s = s;
		System.out.println("Inside the constructor " + s);
	}
}
