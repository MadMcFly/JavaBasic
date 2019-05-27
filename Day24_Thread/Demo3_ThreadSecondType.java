package com.sl.thread;

public class Demo3_ThreadSecondType {

	public static void main(String[] args) {
		new Thread(new MyRunnable()).start();
		
		for(int i = 0; i < 1000; i++) {
			System.out.println("main thread...");
		}
	}

}

class MyRunnable implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println("MyRunnable...");
		}
	}
	
}