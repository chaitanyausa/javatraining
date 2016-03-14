package com.corejava.oops.lakshmi;

public class StudentTest {
	
	public static void  main(String[] args){
		
		Object object = new Object();
		int tmpAge=33;
		Student student = new Student();
			student.sno = 1;
			student.sname="rajesh";	
			if(tmpAge>0)
				student.sage=tmpAge;
			else
				student.sage=0;
			
		
			
			
		StudentSecure studentSecure = new StudentSecure();
			studentSecure.setSno(2);
			studentSecure.setSname("Raghu");
			studentSecure.setSage(-30);
		
		
		System.out.println("Student ::"+student);
		System.out.println("Secure Student ::"+studentSecure);
					
	}

}
