package com.corejava.oops.objectmethods;

public class ComplexNumber {

	private int realPart;
	private int imgPart;
	public int sum;
	public int sub;

	public ComplexNumber() {

	}

	/**
	 * 
	 * @param realPart
	 * @param imgPart
	 */
	public ComplexNumber(int realPart, int imgPart) {
		this.realPart = realPart;
		this.imgPart = imgPart;
	}

	@Override
	public String toString() {
		return realPart + "+" + imgPart + "i";
	}

	/**
	 * @return the realPart
	 */
	public int getRealPart() {
		return realPart;
	}

	/**
	 * @param realPart
	 *            the realPart to set
	 */
	public void setRealPart(int realPart) {
		this.realPart = realPart;
	}

	/**
	 * @return the imgPart
	 */
	public int getImgPart() {
		return imgPart;
	}

	/**
	 * @param imgPart
	 *            the imgPart to set
	 */
	public void setImgPart(int imgPart) {
		this.imgPart = imgPart;
	}

	public ComplexNumber add(ComplexNumber num) {

		ComplexNumber num1 = this;
		ComplexNumber num2 = num;
		
		int relPart = num1.realPart + num2.realPart;
		int imgPart = num1.imgPart + num2.imgPart;		
		ComplexNumber res = new ComplexNumber(relPart, imgPart);

		return res;
	}
	
	public static ComplexNumber addStatic(ComplexNumber num1, ComplexNumber num2) {

		int relPart = num1.realPart + num2.realPart;
		int imgPart = num1.imgPart + num2.imgPart;
		// ComplexNumber res = new ComplexNumber((num1.realPart+num2.realPart),
		// (num1.imgPart+num2.imgPart));
		ComplexNumber res = new ComplexNumber(relPart, imgPart);

		return res;
	}

	public ComplexNumber substraction(ComplexNumber num1, ComplexNumber num2) {

		ComplexNumber subRes = new ComplexNumber((num1.realPart - num2.realPart), (num1.imgPart - num2.imgPart));
		
		return subRes;

	}
	public ComplexNumber multipication(ComplexNumber num1, ComplexNumber num2) {

		ComplexNumber multiRes = new ComplexNumber((num1.realPart * num2.realPart), (num1.imgPart * num2.imgPart));
		
		return multiRes;

	}

	
	@Override
	public boolean equals(Object obj) {
		boolean res = false;
		if(obj instanceof ComplexNumber){
			ComplexNumber obj1 = (ComplexNumber) obj;
			if(this.realPart== obj1.realPart && this.imgPart == obj1.imgPart)
				res=true;
		}
		/*
		boolean res = false;
		if(obj instanceof ComplexNumber){
			ComplexNumber num2 = (ComplexNumber) obj;//number2
			
			ComplexNumber num1 = this;
			
			if(num1.realPart==num2.realPart && num1.imgPart==num2.imgPart){
				res = true;	
			}
		}*/
		return res;
	}
		/*if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
	ComplexNumber other = (ComplexNumber) obj;
		if (imgPart != other.imgPart)
			return false;
		if (realPart != other.realPart)
			return false;
		if (sub != other.sub)
			return false;
		if (sum != other.sum)
			return false;
		return true;
		
		
	*/

}
