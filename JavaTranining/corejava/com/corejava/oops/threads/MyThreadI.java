package com.corejava.oops.threads;

public class MyThreadI implements Runnable{

	@Override
	public void run() {
		go();
		
	}

	private void go() {
		doMore();
		
	}

	private void doMore() {
		// TODO Auto-generated method stub
		System.out.println("top of the stack");
	}

}
