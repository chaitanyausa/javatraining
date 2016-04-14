package com.project.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.project.serviceImpl.EmployeeServiceImpl;

/**
 * Servlet implementation class DeleteServlet
 */

public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		System.out.println("*********inside doPost(DeleteServlet)**********");
    		String name = request.getParameter("empName"); 
  		  EmployeeServiceImpl  getEmp = new EmployeeServiceImpl();
  		  boolean delResult = getEmp.delete(name);
  		  System.out.println(delResult);
    	}

}
