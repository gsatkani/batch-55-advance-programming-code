package com.wipro.javaeight;

import java.util.ArrayList;
import java.util.List;

public class Sample {
	
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(100);
		
		list.add(200);
		list.add(300);
		list.add(400);
		System.out.println("---Java 8 Features -  forEach");
		list.forEach((a) ->{
			 System.out.println(a);
		});
		
		
		System.out.println("---Normal For Each");
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
		
		
	}

}
