package com.corejava.oops.objectmethods;

import java.io.*;

public class ExceptionDemo {
	public static FileInputStream f1(String fileName) throws FileNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		System.out.println("File input stream created");
		return fis;
	}

	public static FileInputStream f2(String fileName) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(fileName);
		} catch (FileNotFoundException ex) {
			System.out.println("FileNotFoundException caught");
		} finally {
			System.out.println("finally block");
		}
		System.out.println("Returning from f2");
		return fis;
	}
}
