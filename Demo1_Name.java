package com.sl.method;

public class Demo1_Name {

	public static void main(String[] args) {
//		demo1();
//		demo2();
		new Thread() {
			public void run() {
				this.setName("alice");
				System.out.println(this.getName() + "\taaaa");
			}
		}.start();
		
		new Thread() {
			public void run() {
				this.setName("bob");
				System.out.println(this.getName() + "\tbb");
			}
		}.start();
	}

	private static void demo2() {
		new Thread("alice") {
			public void run() {
				System.out.println(this.getName() + "\taaa");
			}
		}.start();
		
		new Thread("bob") {
			public void run() {
				System.out.println(this.getName() + "\tbb");
			}
		}.start();
	}

	private static void demo1() {
		new Thread() {
			public void run() {
				System.out.println(this.getName() + "\taaaa");
			}
		}.start();
		
		new Thread() {
			public void run() {
				System.out.println(this.getName() + "\tbb");
			}
		}.start();
	}

}
