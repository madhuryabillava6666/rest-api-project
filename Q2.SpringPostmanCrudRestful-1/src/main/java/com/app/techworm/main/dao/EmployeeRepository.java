package com.app.techworm.main.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.techworm.main.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {


}
