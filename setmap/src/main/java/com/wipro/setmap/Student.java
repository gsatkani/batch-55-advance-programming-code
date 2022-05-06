package com.wipro.setmap;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Student {

	public static void main(String[] args) {

		// Map - Store the data in Key Value pair
		// Key - Student Roll No Value= marks
		Map<Integer, Integer> studentMarks = new HashMap<Integer, Integer>();
		studentMarks.put(1001, 89);
		studentMarks.put(1002, 99);
		studentMarks.put(1002, 100); // No Duplicate Keys
		studentMarks.put(1003, 66);
		studentMarks.put(1004, 76);
		studentMarks.put(1005, 34);
		// studentMarks.put(1006, null); // Add null values
		// studentMarks.put(null, 76); // one null key is allowed

		// Calculate total marks whose roll no is even
		int totalSum=0;
		for( Entry<Integer, Integer>  map : studentMarks.entrySet()) {
			
			if(map.getKey() %2 ==0) {
				totalSum=totalSum+map.getValue();
			}
			
		}
		
		System.out.println("Even Roll No " + totalSum);
		
		// Calculate total marks whose roll no is odd

		 // Date date=new Date();
		
		// A map entry (key-value pair)
		for (Entry<Integer, Integer> hmap : studentMarks.entrySet()) {
			System.out.println(hmap.getKey() + "--" + hmap.getValue());

			// display Student roll no who got marks more than 50
			if (hmap.getValue() > 50) {
				System.out.println(hmap.getKey());
			}

		}

		System.out.println(studentMarks);
		Integer mark = studentMarks.get(1001);
		System.out.println(mark); // 89

		Set<Integer> keySet = studentMarks.keySet();
		System.out.println(keySet);

		Collection<Integer> values = studentMarks.values();
		System.out.println(values);

		boolean containsKey = studentMarks.containsKey(1002);
		System.out.println(containsKey);
		boolean containsValue = studentMarks.containsValue(66);
		System.out.println(containsValue);

		studentMarks.remove(null);
		System.out.println(studentMarks);

	}

}
