package com.corejava.oops.threads;

public class RunnableThreadTest {

	public static void main(String[] args) {
		RunnableThread thread1  = new RunnableThread("Thread1",new SampleThread("SampleThd1", 4));		
			thread1.start();
			
		RunnableThread thread2 = new RunnableThread("Thread2");
			thread2.start();
		

	}

}
