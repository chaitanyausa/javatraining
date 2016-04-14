package com.project.serviceImpl;

import java.sql.SQLException;
import java.util.List;
import com.project.Dao.AbstarctDAO;
import com.project.Dao.EmployeeDAO;
import com.project.Dao.Impl.EmployeeDAOImpl;
import com.project.dto.Employee;
import com.project.service.EmployeeService;

public class EmployeeServiceImpl extends AbstarctDAO implements EmployeeService {

	EmployeeDAO employeeDao;

	public EmployeeServiceImpl() {
		employeeDao = new EmployeeDAOImpl();
	}
	
	@Override
	public List<Employee> listAll() {
		List<Employee> empList = employeeDao.listAll();
		return empList;
	}

	@Override
	public Employee search(String empName) {
		Employee emp = employeeDao.searchByName(empName);
		return emp;
	}

	@Override
	public boolean delete(String empName) {
		System.out.println("**********EmployeeServiceImpl(delete method)*********");
		boolean result = false;
		Employee emp = employeeDao.searchByName(empName);
		if(emp!=null){
			System.out.println("**********EmployeeServiceImpl(emp!=null)*********");
			result = employeeDao.delete(emp);			
		}else{
			System.err.println("There is no such employee available");
		}
		return result;
	}

	@Override
	public boolean addEmployee(Employee emp) throws SQLException {
		System.out.println("*******addEmployee method************");
		boolean result = employeeDao.insert(emp);
		return result;
	}
}
