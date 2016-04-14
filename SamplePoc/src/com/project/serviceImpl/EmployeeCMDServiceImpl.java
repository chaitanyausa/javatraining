package com.project.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.project.dto.Employee;
import com.project.service.EmployeeService;

public class EmployeeCMDServiceImpl implements EmployeeService{

public List<Employee> empList;
	
	public EmployeeCMDServiceImpl() {
		empList =  new ArrayList<Employee>();
	}
	
	@Override
	public boolean addEmployee(Employee emp) {
		if(emp!=null){
			empList.add(emp);
			return true;
		}
		return false;
	}

	@Override
	public List<Employee> listAll() {
		if(empList!=null && empList.size()>0){
			for(int i=0;i<empList.size();i++){
			    System.out.println(empList.size());
			} 
		}   
			return empList;
	}

	@Override
	public Employee search(String empName) {
		
		return null;
	}

	@Override
	public boolean delete(String empName) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public static void clearScreen() {  
	    System.out.print("\033[H\033[2J");  
	    System.out.flush();  
	   }  
}
