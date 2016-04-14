package com.project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.dto.Employee;
import com.project.service.EmployeeService;
import com.project.serviceImpl.EmployeeServiceImpl;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/Search")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("empName"); 
		  EmployeeService  getEmp = new EmployeeServiceImpl();
		  Employee empl = getEmp.search(name); 
		  PrintWriter out =response.getWriter();
		  out.println("<table border=2 align=center>");
		  out.println("<tr><th>EmpName</th></tr><tr><th>EmpDesg</th></tr><tr><th>EmpDept</th></tr><tr><th>EmpAdd</th></tr>");
		  out.println("<tr>"); out.println("<td>"+empl.getEmpName() +"</td>");
		  out.println("<td>"+empl.getEmpDesg() +"</td>" );
		  out.println("<td>"+empl.getEmpDept() +"</td>" );
		  out.println("<td>"+empl.getEmpAdd() +"</td>"); 
		  out.println("</tr>");
		  out.println("</table>");
	}

}
