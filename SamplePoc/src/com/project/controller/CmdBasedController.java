package com.project.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;
import com.project.dto.Employee;
import com.project.serviceImpl.EmployeeServiceImpl;

public class CmdBasedController {

	public static void main(String[] args) throws IOException, SQLException {

		Scanner scanner = new Scanner(System.in);
		int choice;
		EmployeeServiceImpl empService = new EmployeeServiceImpl();
		do {
			// user select from console
			System.out.println("-------------------------------------");
			System.out.println("0.Exit");
			System.out.println("1.Add");
			System.out.println("2.View All");
			System.out.println("3.Search");
			System.out.println("4.Remove");
			System.out.println("-------------------------------------");
			System.out.print("Enter your choice");

			choice = scanner.nextInt();
			if (choice == 0) {
				System.out.println("program will exit");
			} else if (choice == 1) {

				System.out.println("Enter the name of the Emp");
				String empName = scanner.next();
				System.out.println("Enter the Desg of the Emp");
				String empDesg = scanner.next();
				System.out.println("Enter the dept of Emp");
				String empDept = scanner.next();
				System.out.print("Enter the sal ");
				String empAdd = scanner.next();

				Employee emp = new Employee(empName, empDesg, empDept, empAdd);
				try {
					empService.addEmployee(emp);
				} catch (SQLException e) {

					e.printStackTrace();
				}finally{
					scanner.close();
				}

				System.out.println("add sucesses fully");
				System.out.println("Clear the screen ");
				for (int i = 0; i < 10; i++) {
					System.out.println();
				}
			} else if (choice == 2) {
				System.out.println("List the all employees");
				empService.listAll();
				System.out.println("Employeelist" +empService.listAll());
			} else if (choice == 3) {
				System.out.println("Enter the name of the Emp for search");
				String empName = scanner.next();
				empService.search(empName);
			} else if (choice == 4) {
				System.out.println("Enter the name of the Emp for delete");
				String empName = scanner.next();
				empService.delete(empName);
			}
		} while (choice > 0);
	}
}

