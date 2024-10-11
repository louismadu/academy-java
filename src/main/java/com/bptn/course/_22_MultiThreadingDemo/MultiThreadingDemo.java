package com.bptn.course._22_MultiThreadingDemo;

public class MultiThreadingDemo {

	public static void main(String[] args) {
//		MyThread t1 = new MyThread();
//		MyThread t2 = new MyThread();
//		MyThread t3 = new MyThread();
//		
//		
//
//		t1.start();
//		t2.start();
//		t3.start();

		MyThread t1 = new MyThread();
		Thread t2 = new Thread(new MyRunnable());

		t1.start();
		t2.start();
	}

}
