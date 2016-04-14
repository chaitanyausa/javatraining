package com.corejava.oops.objectmethods;

public class TestMultipleCatchBlock {
	public static void main(String args[]) {
		try {
			int[] array = new int[5];
			array[5] = 30 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Throws the ArithmeticException");
		}
		try {
			int[] array = new int[5];
			/*for (int index = 1; index <= array.length; index++) {
				System.out.println(array[index]);
			}*/
			int boom = array[10];

		}  catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Throws the ArrayIndexOutOfBoundsException");
			
		} catch (Exception e) {
			System.out.println("capital task completed");
		}

		System.out.println("rest of the code...");
	}
}
