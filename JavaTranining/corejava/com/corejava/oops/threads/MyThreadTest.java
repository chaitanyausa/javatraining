package com.corejava.oops.threads;

public class MyThreadTest {

	public MyThreadTest(MyThreadI threadI) {
	}

	public static void main(String[] args) {
		Runnable threadI = new MyThreadI();
		Thread test = new Thread(threadI);
		test.start();
		System.out.println("back in main");
		}

}
