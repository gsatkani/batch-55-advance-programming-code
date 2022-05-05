package com.wipro.datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {

		List<Double> cgpa = new ArrayList<Double>();
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			cgpa.add(scanner.nextDouble());
		}
		// Sum of an array elements
		// maximum element
		// minimum
		// Search an element array
		// Sort an array
		double sum = 0.0;
		// i=- contion
		for (Double val : cgpa) { // start and end of array
			// Loop 1: val=10
			// sum = sum + 10 ; 0+10 =10
			// Loop 2: val=20
			// sum = 10 + 20 = 30
			sum = sum + val;
		}
		System.out.println("Total Sum " + sum);

		double min = cgpa.get(0);
		double max = cgpa.get(0);
		for (Double val : cgpa) {
			if (min > val) {
				min = val;
			}
		}
		System.out.println("Minimum CGPA " + min);

		scanner.close();
	}

}
