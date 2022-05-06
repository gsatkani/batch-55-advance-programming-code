package com.wipro.employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.wipro.dao.EmployeeService;
import com.wipro.dao.EmployeeServiceImpl;
import com.wipro.model.Employee;
import com.wipro.model.EmployeeNameComparator;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("employee.csv"));
		EmployeeService service = new EmployeeServiceImpl();

		String line = "";
		while ((line = reader.readLine()) != null) {
			String[] split = line.split(",");// split[0]=101 split[1]=Murali split[2]=30000 split[3]=Wipro
			Employee employee = new Employee();
			employee.setId(Integer.parseInt(split[0]));
			employee.setName(split[1]);
			employee.setSalary(Double.parseDouble(split[2]));
			employee.setCompany(split[3]);
			employee.setCity(split[4]);

			boolean status = service.addEmployeeDetail(employee);
			if (status)
				System.out.println("Employee Id: " + employee.getId() + " Added");
			else
				System.out.println("Not Added");

		}
		List<Employee> empList = service.getAllEmployeeDetails();
		empList.sort(new EmployeeNameComparator());
		
		if (empList.isEmpty()) {
			System.out.println("Employee List is Empty");
		} else {
			System.out.println("List of Employees");
			for (Employee emp : empList) {
				System.out
						.println(emp.getId() + "--" + emp.getName() + "--" + emp.getSalary() + "--" + emp.getCompany());
			}
		}
		
		System.out.println("Enter Salary");
		double salary=50000;
				
		List<Employee> greaterThan = service.employeeSalaryGreaterThan(salary);		
		if (greaterThan.isEmpty()) {
			System.out.println("Employee List is Empty");
		} else {
			System.out.println("List of Employees greater than "+ salary);
			for (Employee emp : greaterThan) {
				System.out
						.println(emp.getId() + "--" + emp.getName() + "--" + emp.getSalary() + "--" + emp.getCompany());
			}
		}
		reader.close();

	}
}
