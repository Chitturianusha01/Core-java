package com.tnsif.thread;

public class SetThreadPriority extends Thread {
	public void run() {
		System.out.println("Thread " + Thread.currentThread().getName() +"started");
		System.out.println("Thread with priority" +Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     SetThreadPriority t1=new SetThreadPriority();
     SetThreadPriority t2=new SetThreadPriority();
     SetThreadPriority t3=new SetThreadPriority();
     t1.setPriority(2);
     t2.setPriority(1);
     t3.setPriority(7);
     t1.start();
     t2.start();
     t3.start();
     System.out.println("Priority of thread" + t1.getName() +":" +t1.getPriority());
	}
	

}
