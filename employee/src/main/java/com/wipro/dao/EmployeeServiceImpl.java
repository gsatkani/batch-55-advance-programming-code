package com.wipro.dao;

import java.util.ArrayList;
import java.util.List;

import com.wipro.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	List<Employee> employeeList = new ArrayList<Employee>();

	public boolean addEmployeeDetail(Employee employee) {
		boolean status = employeeList.add(employee);
		return status;
	}

	public List<Employee> getAllEmployeeDetails() {

		return employeeList;
	}

	public List<Employee> employeeSalaryGreaterThan(double salary) {
		List<Employee> list = new ArrayList<Employee>();
		for (Employee employee : employeeList) {
			if (employee.getSalary() > salary) {
				list.add(employee);
			}
		}
		return list;
	}
}
