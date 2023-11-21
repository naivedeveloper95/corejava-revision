package com.java8.methodref.constructors;

public class Test {

	public static void main(String[] args) {
		MyInterface mif = s -> new MyClass(s);
		mif.get("Using Lambdas");

		MyInterface mif1 = MyClass::new;
		mif1.get("Using Constructor mapping");
	}

}
