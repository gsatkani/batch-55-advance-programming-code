package com.wipro.javaeight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalExample {

	public static void main(String[] args) {
		
		String doj="09-05-2021"; // dd/MM/yyyy  MM/dd/yyyy dd-MM-yyyy MM-dd-yyyy
		// String to Date through formatter
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		LocalDate dateOfJoining=LocalDate.parse(doj, formatter); // yyyy-MM-dd
		
		System.out.println("Date of Joining " + dateOfJoining);
		
		LocalDate plusDays = dateOfJoining.plusDays(100);
		System.out.println(plusDays);
		
		LocalDate plusMonths = dateOfJoining.plusMonths(10);
		System.out.println(plusMonths);
		
		LocalDate plusYears = dateOfJoining.plusYears(1);
		System.out.println(plusYears);
		
		
		System.out.println(dateOfJoining.isAfter(LocalDate.now()));
		System.out.println(dateOfJoining.isBefore(LocalDate.now()));
		System.out.println(dateOfJoining.isEqual(LocalDate.now()));
		
		//Date to String
		String string = dateOfJoining.toString();
		System.out.println(string);
		
		
		
		
	}
	
	
}
