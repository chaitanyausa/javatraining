package com.corejava.oops.lakshmi;

public class StudentSecure {
	
	private int sno;
	
	private String sname;
	
	private int sage;
	
	public StudentSecure(){
		
	}
		
	public String toString(){
		return "Sno::"+this.sno+"; SName::"+this.sname+"; Sage::"+this.sage;
	}
	public StudentSecure(int sno, String sname, int sage){
		this.sno = sno;
		this.sname=sname;
		this.sage=sage;
	}

	/**
	 * @return the sno
	 */
	public int getSno() {
		return sno;
	}

	/**
	 * @param sno the sno to set
	 */
	public void setSno(int sno) {
		this.sno = sno;
	}

	/**
	 * @return the sname
	 */
	public String getSname() {
		return sname;
	}

	/**
	 * @param sname the sname to set
	 */
	public void setSname(String sname) {
		this.sname = sname;
	}

	/**
	 * @return the sage
	 */
	public int getSage() {
		return sage;
	}

	/**
	 * @param sage the sage to set
	 */
	public void setSage(int sage) {
		if(sage<=0){
			System.err.println("Age cannot be negative");
		}else{
			this.sage = sage;
		}
	}
	
	
	
	

}
