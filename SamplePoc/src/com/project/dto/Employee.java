package com.project.dto;

public class Employee {
	protected String empName;
	protected String empDesg;
	protected String empDept;
	protected String empAdd;
	
	public Employee() {
		
		// TODO Auto-generated constructor stub
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDesg() {
		return empDesg;
	}

	public void setEmpDesg(String empDesg) {
		this.empDesg = empDesg;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public String getEmpAdd() {
		return empAdd;
	}

	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}

	public Employee(String empName, String empDesg, String empDept, String empAdd) {

		this.empName = empName;
		this.empDesg = empDesg;
		this.empDept = empDept;
		this.empAdd = empAdd;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empAdd == null) ? 0 : empAdd.hashCode());
		result = prime * result + ((empDept == null) ? 0 : empDept.hashCode());
		result = prime * result + ((empDesg == null) ? 0 : empDesg.hashCode());
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empAdd == null) {
			if (other.empAdd != null)
				return false;
		} else if (!empAdd.equals(other.empAdd))
			return false;
		if (empDept == null) {
			if (other.empDept != null)
				return false;
		} else if (!empDept.equals(other.empDept))
			return false;
		if (empDesg == null) {
			if (other.empDesg != null)
				return false;
		} else if (!empDesg.equals(other.empDesg))
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empDesg=" + empDesg + ", empDept=" + empDept + ", empAdd=" + empAdd
				+ "]/n";
	}
	

	}
