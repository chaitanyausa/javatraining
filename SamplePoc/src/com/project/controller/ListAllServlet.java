package com.project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.Dao.EmployeeDAO;
import com.project.Dao.Impl.EmployeeDAOImpl;
import com.project.service.EmployeeService;
import com.project.serviceImpl.EmployeeServiceImpl;

/**
 * Servlet implementation class ListAllServlet
 */

public class ListAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {		
		System.out.println("*********inside doPost(ListAllServlet)**********");

		EmployeeService service = new EmployeeServiceImpl();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try{
		service.listAll();
	}catch(Exception e){
		e.printStackTrace();
	}
	}
}
