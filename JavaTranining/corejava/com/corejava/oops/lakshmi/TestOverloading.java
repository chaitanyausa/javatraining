package com.corejava.oops.lakshmi;

public class TestOverloading {

	public static void main(String args[]) {
		ArthamaticOperations operations = new ArthamaticOperations();
		// TestOverloading test=new TestOverloading();
		operations.sum(10, 10, 10);
		operations.sum(20, 20);
		operations.sum(12., 4, 9);

	}

}
