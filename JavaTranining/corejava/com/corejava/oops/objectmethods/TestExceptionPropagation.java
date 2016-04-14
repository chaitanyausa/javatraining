package com.corejava.oops.objectmethods;

import java.io.FileNotFoundException;

public class TestExceptionPropagation {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionPropagation obj=new ExceptionPropagation();
		
		/*
		try {
			obj.method1();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			 
		}
		try {
			obj.method2();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}*/
		obj.divide(10,0);
		
		System.out.println("...normal flow....");
		
	}

}
