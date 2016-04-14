package com.project.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.project.dto.Employee;
import com.project.service.EmployeeService;
import com.project.serviceImpl.EmployeeServiceImpl;


public class SubmitFormVer2 extends HttpServlet implements Servlet {
	

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("********inside Post method**********");
		EmployeeService getEmp = null;

		EmployeeService service = new EmployeeServiceImpl();
		String insert = request.getParameter("Submit");
		String search = request.getParameter("Search");
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		Employee emp = buildEmployee(request);
		
		/* This line will call the employee insert/add method */
		try {
			service.addEmployee(emp);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	/***********Get Emp details based on name***************/
	/*String name = request.getParameter("empName");
    EmployeeServiceImpl getEmp = new EmployeeServiceImpl();
    Employee empl = getEmp.search(name);
    PrintWriter out =response.getWriter();
    out.println("<table border=2 align=center>");
    out.println("<tr><th>EmpName</th></tr><tr><th>EmpDesg</th></tr><tr><th>EmpDept</th></tr><tr><th>EmpAdd</th></tr>");
    out.println("<tr>");
    out.println("<td>"+empl.getEmpName() +"</td>" );
    out.println("<td>"+empl.getEmpDesg() +"</td>" );
    out.println("<td>"+empl.getEmpDept() +"</td>" );
    out.println("<td>"+empl.getEmpAdd()  +"</td>");
    out.println("</tr>");
    out.println("</table>");*/
	
	}
	
	public static Employee buildEmployee(HttpServletRequest request){
		
		String empName = request.getParameter("empName");
		String empDesg = request.getParameter("empDesg");
		String empDept = request.getParameter("empDept");
		String empAdd = request.getParameter("empAdd");

		Employee emp = new Employee(empName,empDesg,empDept,empAdd);
		
		return emp;
	}
	
	

}
