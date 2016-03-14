package com.corejava.oops.myownscenorios;

public abstract class Employee {
	int id;
	String name;
	String disgnation;
	String gender;
	String phone;
	
	public abstract void calculateSalary();
	
	public void getDetails(){
		System.out.println("id      :" +id);
		System.out.println("disgnation     :" +disgnation);
		System.out.println("gender     :" +gender);
		System.out.println("phone     :" +phone);
		System.out.println();
		
	}
	
	

}
