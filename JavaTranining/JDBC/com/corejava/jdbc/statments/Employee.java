package com.corejava.jdbc.statments;

public class Employee {	
	
	private int empId;
	private String firstName;
	private String lastName;	
	private float salary;
	
	public String toString(){
		return "EmpId::"+empId+"; FirstName::"+firstName+"; LastName::"+lastName+"; Salary::"+salary+"\n";
	}
	
	/**
	 * @param empId
	 * @param firstName
	 * @param lastName
	 * @param salary
	 */
	public Employee(int empId, String firstName, String lastName, float salary) {
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the salary
	 */
	public float getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(float salary) {
		this.salary = salary;
	}	
}
