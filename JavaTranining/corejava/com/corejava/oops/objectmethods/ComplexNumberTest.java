package com.corejava.oops.objectmethods;

import com.corejava.oops.lakshmi.Student;

public class ComplexNumberTest {

	public static void main(String[] args) {
		
		//a+bi
		ComplexNumber number1 = new ComplexNumber(5,4);
		ComplexNumber number2 = new ComplexNumber(10,7);
		//System.out.println("Complex number 1::"+number1);
		//System.out.println("Complex number 2::"+number2);
		// (5+4i)+(10+7i) = 15+11i 
		/*
		 * (a+bi)(x+yi) = ax+ayi+xbi+-by = (ax-by)+i(ay+bx)
		 */
		
		//System.out.println("Adition : "+ComplexNumber.addStatic(number1, number2));
		//System.out.println("Adition : "+number1.add(number2));
		
		boolean res = number1.equals(null);
		System.out.println("Result of equals method::"+res);
		//System.out.println("Substraction : "+number1.substraction(number1, number2));
		//System.out.println("Multiplication :  "+number1.multipication(number1, number2));
		//System.out.println();
		//equals verification
		/*
		if(number1.equals(number2)){
		System.out.println("true");
		
		}else{
			System.out.println("false");
		}
		*/

	} 

	/*
	public static ComplexNumber addStatic(ComplexNumber num1, ComplexNumber num2) {

		int relPart = num1.getRealPart() + num2.getRealPart();
		int imgPart = num1.getImgPart() + num2.getImgPart();
		// ComplexNumber res = new ComplexNumber((num1.realPart+num2.realPart),
		// (num1.imgPart+num2.imgPart));
		ComplexNumber res = new ComplexNumber(relPart, imgPart);

		return res;
	}*/


}
