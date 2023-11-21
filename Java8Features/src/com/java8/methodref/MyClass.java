package com.java8.methodref;

public class MyClass {

	public void myMethod1(int i) {
		System.out.println(i);
	}

	public static void main(String[] args) {
		MyInterface mif = i -> System.out.println(i);

		mif.myMethod(10);

		MyClass c = new MyClass();
		MyInterface mif1 = c::myMethod1;
		mif1.myMethod(10);
	}

}
