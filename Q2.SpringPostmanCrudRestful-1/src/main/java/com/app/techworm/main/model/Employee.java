package com.app.techworm.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.redis.core.RedisHash;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity

@Table(name="employee_table", catalog="employee_database")
@Getter
@Setter
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
	
	
	
	
}
