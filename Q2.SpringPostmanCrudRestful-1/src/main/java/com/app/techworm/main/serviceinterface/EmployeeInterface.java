package com.app.techworm.main.serviceinterface;

import java.util.List;

import com.app.techworm.main.model.Employee;

public interface EmployeeInterface {
	//to save new employee
	public Employee saveEmployee(Employee employee);
	//to update Employee
	public Employee updateEmployee(Employee employee);
	//to fetch all employees from database
	public List<Employee> findAllEmployees();
	//to delete employee
	public void deleteEmployee(int empId);
	
}
