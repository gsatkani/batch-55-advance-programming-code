package com.wipro.datastructure;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// Array - DataStructure - Store the data in continuous memory location
		String[] company = new String[5]; // 4*5 =20 bytes fixed size
		company[0] = "Wipro";
		company[1] = "Stackroute"; // 8 => 12 Bytes wasted

		// List DataStucture - collection of ordered elements
		// ArrayList - Dynamic in nature
		// List<Integer> a =new List<Integer>();
		List<Integer> cgpa = new ArrayList<Integer>();
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(100);
		marks.add(200);
		marks.add(300);
		marks.add(400);
		marks.add(500);
		marks.add(100); // add duplicate values
		marks.add(null);// add null values
		System.out.println(marks);

		Integer phy = marks.get(0);
		System.out.println("Get Value at Particular Index " + phy);
		int key = 300;
		if (marks.contains(key)) {
			System.out.println(key + " is found");
		} else {
			System.out.println(key + " is not found");
		}

		Integer newValue = marks.set(1, 5000);
		System.out.println(newValue);

		Integer remove = marks.remove(0);
		System.out.println(remove);
		System.out.println(marks);

		System.out.println("length of ArrayList " + marks.size());

		List<Integer> subList = marks.subList(0, 4);
		System.out.println(subList);

		System.out.println(marks.isEmpty());
		System.out.println(marks.equals(subList));
          
		// sum of an array list
	}
}
