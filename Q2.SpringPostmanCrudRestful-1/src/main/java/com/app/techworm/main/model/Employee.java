package com.app.techworm.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_table", catalog="employee_database")
public class Employee {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO )
	
	private int empId;
	private String empName;
	private String skillType;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee( int empId, String empName, String skillType) {
		super();
		
		this.empId = empId;
		this.empName = empName;
		this.skillType = skillType;
		
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getSkillType() {
		return skillType;
	}
	public void setSkillType(String skillType) {
		this.skillType = skillType;
	}
	
	
}
