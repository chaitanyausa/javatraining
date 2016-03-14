package com.corejava.oops.myownscenorios;

public class GenericTeacherClass implements ClassesDetails {

	String sname;
	String className;
	String teacherName;

	@Override
	public void getTeacherDetails(String className) {
		// TODO Auto-generated method stub
		System.out.println("Display Classdetails");
		if(className=="10thclass"){
			teacherName ="xxx";
		}else if(className=="9thclass"){
			teacherName ="yyy";
		}
		System.out.println("Display Classdetails: "+teacherName);
	}

	@Override
	public void getClassDetails(String className) {
		// TODO Auto-generated method stub
		System.out.println("Display teacher details");
	}

	
}
