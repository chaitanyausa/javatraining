package com.project.service;

import java.sql.SQLException;
import java.util.List;

import com.project.dto.Employee;

public interface EmployeeService  {

	public boolean addEmployee(Employee emp) throws SQLException;
	
	public List<Employee> listAll();
	
	public Employee search(String empName);
	
	public boolean delete(String empName);
 
	    
	
}
