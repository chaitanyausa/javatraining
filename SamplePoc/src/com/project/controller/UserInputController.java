package com.project.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.project.dto.Employee;
import com.project.service.EmployeeService;
import com.project.serviceImpl.EmployeeServiceImpl;

public class UserInputController {

	/*
	1.Add
	2.ListAll
	3.Search  (by emp ID)
	4.Delete
	5.Exit

User press 1:
Then ask for empId,
once enters the Id, then ask for name,
once emters the name then ask for ....
...
once all properties done: We shoudl show the employee add sucessfully msg
and then wait for 5 sex on the screen. Then go to main menu again
Once user selects 2 .
	We shoudl display all the employees which were inserted till now and then wait for 10 secs and then go to main menu
	once user selects 3 
	then ask for emp id
	then search in the existing emp objest list for that Id and if found show the emp details else show that emp not exisist.
	
	
	
	*/
	public static void main(String[] args) throws SQLException{
		Employee emp = new Employee();
		
		EmployeeService serviceImpl = new EmployeeServiceImpl();
		serviceImpl.addEmployee(emp);
	}
	
	
}

