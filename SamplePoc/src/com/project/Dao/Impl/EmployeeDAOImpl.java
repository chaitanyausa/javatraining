package com.project.Dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.project.Dao.AbstarctDAO;
import com.project.Dao.EmployeeDAO;
import com.project.dto.Employee;

public class EmployeeDAOImpl extends AbstarctDAO implements EmployeeDAO {

	private Connection connection=null;
	
	public EmployeeDAOImpl() {
		connection = getConnection();
	}
	
	@Override
	public boolean insert(Employee emp) {
		System.out.println("******inside insert method************");
		String insertQuery = "insert into test.EmpDetails(empName,empDesg,empDept,empAdd)" + "values(?,?,?,?)";		
		try {
			PreparedStatement ps = connection.prepareStatement(insertQuery);
			ps.setString(1, emp.getEmpName());
			ps.setString(2, emp.getEmpDesg());
			ps.setString(3, emp.getEmpDept());
			ps.setString(4, emp.getEmpAdd());
			int i = ps.executeUpdate();
			if (i == 1) {
				System.out.println("records added sucssesfully");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	@Override
	public Employee searchByName(String name) {
		System.out.println("inside search method");
		String selectQuery = "select * from test.EmpDetails where empName=?";
		Employee emp = null;
		try {
			PreparedStatement pst = connection.prepareStatement(selectQuery);
			pst.setString(1, name);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				emp = new Employee();
				emp.setEmpName(rs.getString("empName"));
				emp.setEmpDesg(rs.getString("empDesg"));
				emp.setEmpDept(rs.getString("empDept"));
				emp.setEmpAdd(rs.getString("empAdd"));

			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return emp;

	}

	@Override
	public Employee searchById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Employee emp) {
		System.out.println("*********inside delete method*******");
		boolean result=false;
		String query = "delete from test.EmpDetails where empName=?";
		try {
			PreparedStatement pst = connection.prepareStatement(query);
			pst.setString(1, emp.getEmpName());
			int noOfRows = pst.executeUpdate();
			if(noOfRows>0){
				result = true;
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return result;
	}

	@Override
	public int update(Employee emp) {

		String query = "update test.EmpDetails set empDesg=?,empDept=?,empAdd=? where empName=?";		
		int noOfRecordsUpdated=0;
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setString(1, emp.getEmpDesg());
			ps.setString(2, emp.getEmpDept());
			ps.setString(3, emp.getEmpAdd());			
			ps.setString(4, emp.getEmpName());
			
			noOfRecordsUpdated = ps.executeUpdate();
			
			if (noOfRecordsUpdated >0) {
				System.out.println("records updated sucssesfully");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return noOfRecordsUpdated;
	}

	@Override
	public List<Employee> listAll() {
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		ResultSet resultSet=null;
		Statement statement=null;
		String selectQuery = "select * from test.EmpDetails";
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(selectQuery);

			while (resultSet.next()) {
				Employee emp = new Employee();
				emp.setEmpName(resultSet.getString("empName"));
				emp.setEmpDesg(resultSet.getString("empDesg"));
				emp.setEmpDept(resultSet.getString("empDept"));
				emp.setEmpAdd(resultSet.getString("empAdd"));
				empList.add(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				resultSet.close();
				connection.close();
			} catch (SQLException e) {				
				e.printStackTrace();
			}
		}
		return empList;
	}

}
