package com.java.collections.set;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class HashSetTest {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Employee emp1 = new Employee(200, 30, "Hari", new Date(2015, 12, 25));
		Employee emp2 = new Employee(150, 35, "John", new Date(2000, 02, 17));
		Employee emp3 = new Employee(215, 28, "Hindu", new Date(2005, 04, 30));
		Employee emp4 = new Employee(234, 40, "Rajesh", new Date(2001, 10, 05));
		Employee emp5 = new Employee(100, 45, "Gaurav", new Date(1995, 8, 21));
		Employee emp6 = new Employee(100, 45, "Gaurav", new Date(1995, 8, 21));

		 //Set<Employee> employeeSet = new HashSet<Employee>();
		//Set<Employee> employeeSet = new LinkedHashSet<Employee>();
		Set<Employee> employeeSet = new TreeSet<Employee>();
		employeeSet.add(emp1);
		employeeSet.add(emp2);
		employeeSet.add(emp3);
		employeeSet.add(emp4);
		employeeSet.add(emp5);
		employeeSet.add(emp6);
		employeeSet.add(emp5);
		
		/* System.out.println("checking emp5 and emp6 equalness::"
		 +emp5.equals(emp6)); System.out.println("Hash code of emp5::"
		 +emp5.hashCode()); System.out.println("Hash code of emp6::"
		 +emp6.hashCode());*/
		
		 
		System.out.println(employeeSet.size());
		System.out.println(employeeSet);
		/*Iterator<Employee> itr = employeeSet.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next()); */
			
		}

	}


