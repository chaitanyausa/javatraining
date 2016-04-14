package com.java.collections.list;

import java.util.Comparator;

public class StudentFeeComparatorOld implements Comparator<Student> {

	@Override
	public int compare(Student st1, Student st2) {
		if(st1.getSfee() >st2.getSfee()){
			return 1;
		}else if(st1.getSfee() < st2.getSfee()){
			return -1;
		}
			return 0;
	}

}
