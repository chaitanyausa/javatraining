package com.corejava.oops.objectmethods;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionPropagation {
	
	public void printAge(int age) throws InvalidAgeException{
		
		if(age>0){
			System.out.println(age);
		}else{
			throw new InvalidAgeException("Age cant be negetive");
		}
	}
	
	
	public void setUpAge(int age) throws CustomException{
		/** Do some calculations
		 * 
		 */
		// print the age
		try{
		printAge(age);
		}catch(InvalidAgeException e){
			throw new CustomException(e.getMessage(),e.getCause());
		}
	}
	
		public void method1()throws CustomException{
		
		//int num=10/0;
		try{
			//int num=10/0;
			FileReader reader = new FileReader(new File(" "));
		
		}catch(FileNotFoundException e){
			throw new CustomException("File is not avaible",e.getCause());
		}
		System.out.println("*****method1*****");	
	}
	
	public void method2() throws FileNotFoundException{
		//int num=10/0;
		try {
			method1();
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("method2");
	}
	
	public void method3(){
		try{
			method2();
		}catch(Exception e){
			
		}
	}
	
	public void divide(int a, int b){
		float res=0;
		if(b!=0){
			res = a/b;
		}else{
			System.err.println("Divident cant be zero");
		}
		System.out.println("Result of a divided by b is : "+res);
	}
}
