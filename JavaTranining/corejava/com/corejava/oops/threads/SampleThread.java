package com.corejava.oops.threads;

public class SampleThread extends Thread{
	
	public Thread thread;
	public String name;
	public int priority;
	

	public SampleThread(String name, int priority){		
		this.name= name;
		this.priority = priority;
	}
	
	public SampleThread(String name, Thread thread){
		this.thread= thread;
		this.name= name;
	}
	
	public void start(){
		System.out.println("I am in thread start method of THread named::"+name);
		if(thread !=null){			
			thread.start();
		}else{
			thread = new Thread(this,name);
			thread.setPriority(priority);
			thread.start();
		}
	}
	
	public void run(){
		System.out.println("I am in run method of Thread Name::"+name);
	}

}
