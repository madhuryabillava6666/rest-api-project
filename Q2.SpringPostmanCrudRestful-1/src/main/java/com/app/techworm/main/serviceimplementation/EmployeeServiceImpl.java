package com.app.techworm.main.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.app.config.ApplicationConfig;
import com.app.techworm.main.config.ApplicationConfiguration;
import com.app.techworm.main.dao.EmployeeRepository;
import com.app.techworm.main.model.Employee;
import com.app.techworm.main.serviceinterface.EmployeeInterface;

@Service
public class EmployeeServiceImpl implements EmployeeInterface{
	
	/*@Autowired
	private ApplicationConfig applicationconfig;*/
	
	
	ApplicationConfiguration applicationconfiguration;
	
	public EmployeeServiceImpl(ApplicationConfiguration applicationconfiguration) {
		this.applicationconfiguration = applicationconfiguration;
	}
	
	
	public String getProperties() {
		return applicationconfiguration.getSpringdatasourceusername();
	}
	
	
	
	
	@Autowired
	private EmployeeRepository employeeRepo;
	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employee);
	}

	@Override
	public List<Employee> findAllEmployees() {
		// it returns a list so casting is needed
		return (List<Employee>) employeeRepo.findAll();
	}
	@Override
	public void deleteEmployee(int empId) {
		// to delete employee 
		employeeRepo.deleteById(empId);;
		
	}

}
