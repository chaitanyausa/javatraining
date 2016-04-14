package com.java.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {

		List<Student> studentsList = new ArrayList<Student>();
		int index = 0;
		Student student1 = new Student(103, "Rajesh", 32, "Houston, Texas", 3600);
		Student student2 = new Student(99, "Zohan", 31, "Pittsburgh, PA", 2500);
		Student student3 = new Student(99, "Raghu", 35, "Austin,TX", 6900);
		Student student4 = new Student(150, "Raghu", 35, "Austin,TX", 5600);

		/*
		 * Student student5 = new Student("hiran",30,"louisville,ky"); Student
		 * student5 = new Student("Ravi",30,"Dallas,TX"); Student student6 = new
		 * Student("Ravi",30,"Dallas,TX"); Student student7 = new
		 * Student("Ravi",30,"Dallas,TX"); Student student8 = new
		 * Student("Ravi",30,"Dallas,TX"); Student student9 = new
		 * Student("Ravi",30,"Dallas,TX"); Student student10 = new
		 * Student("Ravi",30,"Dallas,TX"); Student student11 = new
		 * Student("Ravi",30,"Dallas,TX");
		 */
		System.out.println("List size intally::" + studentsList.size());
		studentsList.add(student1);
		studentsList.add(student2);
		studentsList.add(student3);
		studentsList.add(student4);
		/*
		 * studentsList.add(student5); studentsList.add(student6);
		 * studentsList.add(student7); studentsList.add(student8);
		 * studentsList.add(student9); studentsList.add(student10);
		 *//*
			 * System.out.println("List size after 10th object insertion::"
			 * +studentsList.size()); index=10;
			 * studentsList.add(10,student11);//index 11 System.out.println(
			 * "List size after 11th object insertion::"+studentsList.size());
			 * /* if(studentsList.size()>=index){ studentsList.add(10,student3);
			 * }
			 */
		// System.out.println(studentsList.contains(student1));
		// Student trgStudent = new Student("Rajesh", 32, "Houston, Texas");
		// System.out.println(studentsList.contains(trgStudent));

		//comparator logic
		
		//Collections.sort(studentsList);
		
       // comparable interface logic
		String sortParam = "fee";
		if(sortParam == "fee")
		Collections.sort(studentsList, new StudentFeeComparator());

		// studentsList.con
		System.out.println(studentsList);

	}
}


