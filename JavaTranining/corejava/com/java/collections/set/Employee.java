package com.java.collections.set;

import java.util.Date;

public class Employee implements Comparable<Employee> {
	
	private int empNo;

	private int empAge;

	private String empName;

	private Date doj;

	public boolean equals(Object obj) {
		boolean res = false;
		Employee emp1 = this;
		if (obj instanceof Employee) {
			Employee emp2 = (Employee) obj;
			if (emp1.empNo == emp2.getEmpNo() && (emp1.empName).equalsIgnoreCase(emp2.getEmpName()) && emp1.empAge == emp2.getEmpAge()) {
				return true;
			}
		}

		return res;
	}

	public int hashCode() {
		return this.empNo + this.empName.hashCode()+this.empAge;
	};

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empAge=" + empAge + ", empName=" + empName + ", doj=" + doj + "]\n";
	}

	public Employee() {

	}

	/**
	 * @param empNo
	 * @param empAge
	 * @param empName
	 * @param doj
	 */
	public Employee(int empNo, int empAge, String empName, Date doj) {
		this.empNo = empNo;
		this.empAge = empAge;
		this.empName = empName;
		this.doj = doj;
	}

	/**
	 * @return the empNo
	 */
	public int getEmpNo() {
		return empNo;
	}

	/**
	 * @param empNo
	 *            the empNo to set
	 */
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	/**
	 * @return the empAge
	 */
	public int getEmpAge() {
		return empAge;
	}

	/**
	 * @param empAge
	 *            the empAge to set
	 */
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * @param empName
	 *            the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * @return the doj
	 */
	public Date getDoj() {
		return doj;
	}

	/**
	 * @param doj
	 *            the doj to set
	 */
	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public int compareTo(Employee emp) {
		return this.empName.compareTo(emp.getEmpName());
	}

}
