package com.project.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.Dao.Impl.EmployeeDAOImpl;
import com.project.dto.Employee;
import com.project.service.EmployeeService;
import com.project.serviceImpl.EmployeeCMDServiceImpl;
import com.project.serviceImpl.EmployeeServiceImpl;
import com.project.Dao.AbstarctDAO;
import com.project.Dao.EmployeeDAO;

public class SubmitForm extends HttpServlet implements Servlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		EmployeeServiceImpl getEmp = null;
		EmployeeDAOImpl employeeDAOImpl = null;
		System.out.println("*****doPost method ************");

		EmployeeService service = new EmployeeServiceImpl();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		Employee emp = buildEmployee(request);

		/* This line will call the employee insert/add method */
		try {
			service.addEmployee(emp);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

			}

	public static Employee buildEmployee(HttpServletRequest request) {
System.out.println("**** Build employee method*****");
		String empName = request.getParameter("empName");
		String empDesg = request.getParameter("empDesg");
		String empDept = request.getParameter("empDept");
		String empAdd = request.getParameter("empAdd");

		Employee emp = new Employee(empName, empDesg, empDept, empAdd);

		return emp;
	}

}
