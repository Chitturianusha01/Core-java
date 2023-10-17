package com.tnsif.thread;

public class SetThreadPriorityDemo extends Thread {
	
	public void run() {
		System.out.println("Thread" +Thread.currentThread().getName()+" running");
	}

	public static void main(String[] args) {
		
		SetThreadPriorityDemo th1 = new SetThreadPriorityDemo();
		SetThreadPriorityDemo th2 = new SetThreadPriorityDemo();
		SetThreadPriorityDemo th3 = new SetThreadPriorityDemo();
		
		th1.start();
		th2.start();
		th3.start();
		System.out.println("Priority of thread " +th1.getName() + " : " +th1.getPriority());
		System.out.println("Priority of thread " +th2.getName() + " : " +th2.getPriority());
		System.out.println("Priority of thread " +th3.getName() + " : " +th3.getPriority());

	}

}
