package com.java8.optional;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		Optional<String> empty = Optional.empty();
		System.out.println("isPresent " + empty.isPresent());
		Optional<String> data = Optional.of("Optional but very useful");
		System.out.println("isPresent " + data.isPresent());
	}

}
