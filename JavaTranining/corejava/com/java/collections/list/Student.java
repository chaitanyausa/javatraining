package com.java.collections.list;

import java.io.Serializable;
import java.util.Comparator;

public class Student implements Serializable, Comparable<Student> {

	private int id;

	private String sName;

	private int sage;

	private String address;

	private float sfee;

	public Student() {

	}

	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", sName=" + sName + ", sage=" + sage + ", address=" + address + ", sfee=" + sfee
				+ "]\n";
	}



	@Override
	/**
	 * There method will help to sort the list with respect to student id.
	 */
	public int compareTo(Student std2) {
		Student std1 = this;

		if (std1.id > std2.id) {
			//System.out.println("return1");
			return 1;
		} else if (std1.id < std2.id) {
			//System.out.println("return2");
			return -1;
		} else{
			return (std1.sName).compareTo(std2.sName);
		}	
	}

	public boolean equals(Object obj) {
		/*
		 * boolean res=false; System.out.println(
		 * "Control came to Student equals method and going to Object class equals methid"
		 * ); res = super.equals(obj);
		 * 
		 */

		boolean res = false;
		if (obj instanceof Student) {
			Student std1 = this;
			Student std2 = (Student) obj;
			if (std1.sName == std2.sName && std1.sage == std2.sage && std1.address == std2.address) {
				res = true;
			}

		}

		return res;
	}

	/**
	 * @param sName
	 * @param sage
	 * @param address
	 */
	public Student(int id, String sName, int sage, String address, float sfee) {
		this.id = id;
		this.sName = sName;
		this.sage = sage;
		this.address = address;
		this.sfee = sfee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getSage() {
		return sage;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getSfee() {
		return sfee;
	}

	public void setSfee(float sfee) {
		this.sfee = sfee;
	}	
} 

class StudentFeeComparator implements Comparator<Student> {

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
