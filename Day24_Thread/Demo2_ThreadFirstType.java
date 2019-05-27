package com.sl.thread;

public class Demo2_ThreadFirstType {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		
		for(int i = 0; i < 1000; i++) {
			System.out.println("main thread...");
		}
	}

}

class MyThread extends Thread {

	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println("MyThread...");
		}
	}
	
}