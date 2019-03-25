package com.sl.method;

public class Demo2_CurrentThread {

	public static void main(String[] args) {
		new Thread() {
			public void run() {
				System.out.println(Thread.currentThread().getName() + "\taaaa");
			}
		}.start();
		
		new Thread(new Runnable() {
			public void run() {
				System.out.println(Thread.currentThread().getName() + "\tbb");
			}
		}).start();
		
		Thread.currentThread().setName("mmmmain....");
		System.out.println(Thread.currentThread().getName());
	}

}
