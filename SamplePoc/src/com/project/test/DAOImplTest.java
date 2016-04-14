package com.project.test;

import com.project.Dao.EmployeeDAO;
import com.project.Dao.Impl.EmployeeDAOImpl;
import com.project.dto.Employee;

public class DAOImplTest {

	public static void main(String[] args) {
		
		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		
		Employee emp = new Employee("", "", "", "");
		boolean result = employeeDAO.delete(emp);

	}

}
