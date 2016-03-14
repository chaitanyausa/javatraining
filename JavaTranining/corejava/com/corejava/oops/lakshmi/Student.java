package com.corejava.oops.lakshmi;

public class Student {
	
	public int sno;
	
	public String sname;
	
	public int sage;
	
	
	public Student(){
		
	}
	
	public String toString(){
		return "Sno::"+this.sno+"; SName::"+this.sname+"; Sage::"+this.sage;
	}
	public Student(int sno, String sname, int sage){
		this.sno = sno;
		this.sname=sname;
		this.sage=sage;
	}
	

}
