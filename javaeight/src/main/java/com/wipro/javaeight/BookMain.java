package com.wipro.javaeight;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookMain {

	public static void main(String[] args) {

		List<Book> list = new ArrayList<Book>();
		list.add(new Book("1", "Java"));
		list.add(new Book("2", "Python"));
		list.add(new Book("3", "Csharp"));
		list.add(new Book("4", "C++"));
		list.add(new Book("5", "C"));

		list.forEach((book) -> {
			System.out.println(book.getIsbn() + "--" + book.getName());
		});

		String dateOfPulication = "09-05-2022"; // 09/05/20022 05/09/2022
		// Convert String to java.util.Date (Java 5)
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		try {
			Date dop = sdf.parse(dateOfPulication);
			System.out.println("Date Of Publication " + dop);
             System.out.println(dop.getDate());
             System.out.println(dop.getDay());
             
	  		// Date to String
			String format = sdf.format(dop);
			System.out.println(format);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
