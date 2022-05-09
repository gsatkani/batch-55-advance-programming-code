package com.wipro.javaeight;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//  Social Media Website  - get Detail about user who uses maximum data application

@FunctionalInterface // contain Single Abstract Method
interface SocialMediaApp {
	public String getMessage();
}

public class App {
	public static void main(String[] args) {
		// Java Eight Features
		// Functional Interface and Lambda Expression
		// () -> { }
		SocialMediaApp app = () -> "Welcome to Java 8 Features";
		String message = app.getMessage();
		System.out.println(message);

		// Predefined Functional Interface
		// Represents a function that accepts one argument and produces a result
		Function<Integer, Integer> add = (a) -> {
			int sum = a + 10;
			return sum;
		};

		Integer apply = add.apply(100);
		System.out.println("Sum " + apply);

		Function<Integer, String> oddEven = (no) -> {
			if (no % 2 == 0) {
				return no + " is Even";
			} else {
				return no + " is Odd";
			}
		};

		System.out.println(oddEven.apply(11));
		// Represents a predicate (boolean-valued function) of one argument.
		Predicate<Integer> postiveNegative = (no) -> no > 0;
		boolean test = postiveNegative.test(100);
		if (test) {
			System.out.println("Positve Number");
		} else {
			System.out.println("Nagtive Number");
		}

		// Represents a supplier of results.
		Supplier<String> msg = () -> {
			return "Supplier";
		};
		String string = msg.get();
		System.out.println(string);
		// Represents an operation that accepts a single input argument and returns no result.
		Consumer<String> print = (name) -> {
			System.out.println("Welcome Mr." + name);
		};
		print.accept("Siva K");
		// Date / LocalDate (Java 8)

	}
}
