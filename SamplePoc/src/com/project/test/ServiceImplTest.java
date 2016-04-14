package com.project.test;

import com.project.dto.Employee;
import com.project.service.EmployeeService;
import com.project.serviceImpl.EmployeeServiceImpl;

public class ServiceImplTest {

	public static void main(String[] args) {
			
		EmployeeService employeeService = new EmployeeServiceImpl();
			String empName="";
			boolean result = employeeService.delete(empName);
			
				
	}

}
