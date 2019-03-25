package com.sl.synchronize;

public class Demo2_SynchronizedMethod {

	public static void main(String[] args) {
		Printer2 p = new Printer2();
		
		new Thread() {
			public void run() {
				while(true)
					p.print1();
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true)
					p.print2();
			}
		}.start();
	}

}

class Printer2 {
	
//	public synchronized void print1() {
	public static synchronized void print1() {
			
		System.out.print("a");				//can be interrupted by other Threads
		System.out.print("l");
		System.out.print("i");
		System.out.print("c");
		System.out.print("e\r\n");

	}
	
//	public void print2() {
	public static void print2() {
//		synchronized (this) {					//for non static method
												//the lock is "this"
		synchronized (Printer2.class) {			//for static method
												//the lock is .class file
//		synchronized (new Object()) {			//this won't work, use same lock!
			System.out.print("b");
			System.out.print("o");
			System.out.print("b\r\n");
		}
	}
}