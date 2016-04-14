package com.corejava.oops.threads;

public class RunnableThread implements Runnable {
	
	public String name;
	public Thread thread;
	
	public RunnableThread(String name, Thread thread){
		this.name=name;
		this.thread = thread;
	}
	public RunnableThread(String name){
		this.name=name;
	}
	
	public void start(){
		if(thread!=null){
			thread.start();
		}else{
			thread = new Thread(this, name);
			thread.start();
			//thread.sleep(millis);
		}
	}
	
	
	@Override
	public void run() {
		System.out.println("I am in runnable interface approach run method::Thread name::"+name);
		
	}

}
