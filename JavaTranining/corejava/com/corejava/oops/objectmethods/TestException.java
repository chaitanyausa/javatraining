package com.corejava.oops.objectmethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestException {

	public static void main(String[] args) {
    ExceptionDemo demo = new ExceptionDemo();  
		// TODO Auto-generated method stub
		FileInputStream fis1 = null;
	    FileInputStream fis2 = null;
	    String fileName = "foo.bar";
	    // String fileName = null;

	    System.out.println(  "main: Starting " + ExceptionDemo.class.getName()
	                       + " with file name = " + fileName);

	    // get file input stream 1
	    try {
	      fis1 = demo.f1(fileName);
	    }
	    catch (FileNotFoundException ex)
	    {
	      System.out.println("FileNotFoundException caught");
	    }
	    catch (Exception ex)
	    {
	      System.out.println("genreal exception caught");
	    }

	    // get file input stream 2
	    fis2 = demo.f2(fileName);

	    
	  }
	
}


