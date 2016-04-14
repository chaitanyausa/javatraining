package com.project.Dao;

import java.util.List;

import com.project.dto.Employee;

public interface EmployeeDAO {
	
	public boolean insert(Employee emp);
	
	public Employee searchByName(String name);
	
	public Employee searchById(int  id);
	
	public boolean delete(Employee emp);
	
	public int update(Employee emp);
	
	public List<Employee> listAll();
}
