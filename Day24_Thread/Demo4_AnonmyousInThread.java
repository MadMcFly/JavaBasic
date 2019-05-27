package com.sl.thread;

public class Demo4_AnonmyousInThread {

	public static void main(String[] args) {
		new Thread() {
			public void run() {
				for(int i = 0; i < 1000; i++) {
					System.out.println("Thread...");
				}
			}
		}.start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i < 1000; i++) {
					System.out.println("Runnable...");
				}
			}
		}).start();
	}

}
