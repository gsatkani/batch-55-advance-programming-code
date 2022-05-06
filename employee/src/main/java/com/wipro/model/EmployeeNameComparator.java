package com.wipro.model;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {

	public int compare(Employee o1, Employee o2) {
		// Ascending order of Employee Name
		return o2.getName().compareTo(o1.getName());
	}

}
