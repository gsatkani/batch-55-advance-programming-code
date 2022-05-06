package com.wipro.dao;

import java.util.List;

import com.wipro.model.Employee;

public interface EmployeeService {

	boolean addEmployeeDetail(Employee employee);
	
	List<Employee> getAllEmployeeDetails();
	
	List<Employee> employeeSalaryGreaterThan(double salary);
	
	
}
