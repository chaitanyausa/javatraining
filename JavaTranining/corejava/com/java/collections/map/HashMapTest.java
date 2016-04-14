package com.java.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
	
		Student std1 = new Student(123,"Hari",15);
		Student std2 = new Student(234,"Aravind",10);
		Student std3 = new Student(453,"Bala",23);
		Student std4 = new Student(144,"Naveen",12);
		Student std5 = new Student(90,"Lavanya",9);
		
		Map<String,Student> stdMap = new HashMap<String,Student>();
		
			stdMap.put(std1.getSname(), std1);
			stdMap.put(std2.getSname(), std2);
			stdMap.put(std3.getSname(), std3);
			stdMap.put(std4.getSname(), std4);
			stdMap.put("Bala", std5);
			
			System.out.println(stdMap);
		
		
	}

}
