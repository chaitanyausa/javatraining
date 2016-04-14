package com.corejava.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl extends GenericMySQLDAO implements EmployeeDAO {

	ResultSet rs=null;
	
	public boolean testInsertRollBack(List<Employee> employees){
		
		
		
		return true;
	}
	
	@Override
	public int insertEmployeePreParedAutoGenerated(Employee employee) {
		Connection connection=null;
		PreparedStatement stat = null;
		ResultSet generatedKeys = null;
		int id = 0;
		try{
					
			String sql = "insert into employee (first_name, last_name, salary) values (?,?,?)";
			
			connection = getConnection();	
			stat = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			
			stat.setString(1, employee.getFirstName());
			stat.setString(2, employee.getLastName());
			stat.setInt(3, (int)employee.getSalary());
			
			stat.executeUpdate();			
			generatedKeys = stat.getGeneratedKeys();
			
	        if (generatedKeys.next()) {
	        	employee.setEmpId(generatedKeys.getInt(1));
	        	id= employee.getEmpId();
	        }
			
			//System.out.println("Generated employee id ::"+id);
			
		}catch (SQLException e) {
			e.printStackTrace();
			System.err.println("An error occured while processing");
		}finally{
			try {
				connection.close();
				stat.close();
			} catch (SQLException e) {				
				e.printStackTrace();
			}
		}
		return id;
	}

	public List<Employee> getEmployees() {
		
		List<Employee> employees = new ArrayList<Employee>();
		Employee employee;
		Statement statement=null;
		ResultSet rs=null;
		
		try {
			Connection connection = getConnection();
			
			//connection.commit();
			connection.setAutoCommit(false);
			
			statement = connection.createStatement();

			String sql = "SELECT id, first_name, last_name, salary FROM employee";
			rs = statement.executeQuery(sql);
			
			// STEP 5: Extract data from result set
			while (rs.next()) {
								
				employee = new Employee(rs.getInt("id"), 
								rs.getString("first_name"), 
								rs.getString("last_name"), 
								rs.getInt("salary")); 
				employees.add(employee);
			}			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				super.closeMethod(rs, statement);
			} catch (SQLException e) {
				System.out.println("There seems to be a probblem in closing the things in super class");
				e.printStackTrace();
			}
		}
		return employees;
	}
	
	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

}