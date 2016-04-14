package com.corejava.oops.objectmethods;

public class CustomException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public CustomException() {
		super();
	}
	
	CustomException(String msg){  
		super(msg);  
	}
	
	CustomException(String msg,Throwable throwable){
		super(msg, throwable);
	}

}
