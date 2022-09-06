package com.app.techworm.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.techworm.main.model.Employee;
import com.app.techworm.main.serviceimplementation.EmployeeServiceImpl;

@RestController
//we are using Postman to do operations for that we need to add cross origin annotation
@CrossOrigin("*")
public class HomeController {
		//to create bean of implementation class
		@Autowired
		private EmployeeServiceImpl employeeServiceImpl;
		
		public HomeController(EmployeeServiceImpl employeeServiceImpl) {
			this.employeeServiceImpl = employeeServiceImpl;
		}
		
		
		@GetMapping(value="/properties")
		public ResponseEntity<String> getProperties() {
			return new ResponseEntity<>(employeeServiceImpl.getProperties(), HttpStatus.OK);
		}
		
		//@GetMapping(value="/properties")
		//public String getProperties() {
		//	return employeeServiceImpl.getProperties();
		//}
		
		
		
		//to call save method or to save new employee
		@PostMapping(value="saveEmployee")
		public Employee saveEmployee(@RequestBody Employee employee) {
			System.out.println("employee save works properly");
			employeeServiceImpl.saveEmployee(employee);
			return employee;
		}
		//to find all employees
		@GetMapping(value="getAllEmployees")
		public List<Employee> findAllEmployee(){
			return employeeServiceImpl.findAllEmployees();
		}
		//to update employee entries
		@PutMapping("updateEmployee")
		public Employee updateEmployee(@RequestBody Employee employee)
		{
			return employeeServiceImpl.updateEmployee(employee);
		}
		//to delete an employee
		@DeleteMapping("deleteEmployee")
		public String deleteEmployee(@RequestParam int empId) {
			employeeServiceImpl.deleteEmployee(empId);
			return "Employee Deleted";
			
		}
}