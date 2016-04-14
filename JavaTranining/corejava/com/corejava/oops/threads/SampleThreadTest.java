package com.corejava.oops.threads;

public class SampleThreadTest {

	public static void main(String[] args) {
	
	SampleThread thread1 = new SampleThread("Thread1",2);
	SampleThread thread2 = new SampleThread("Thread2",7);

	thread1.start();
	
	
	thread2.start();
	
	
	}

}
