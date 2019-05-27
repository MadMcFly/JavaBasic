package com.sl.synchronize;

public class Demo1_Synchrinized {

	public static void main(String[] args) {
		Printer p = new Printer();
		Printer p1 = new Printer();				//this won't work, different obj!
		
		new Thread() {
			public void run() {
				while(true)
					p.print1();
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true)
					p1.print2();
			}
		}.start();
	}

}

class Printer {
	Object o = new Object();
	
	public void print1() {
		synchronized (o) {
			
			System.out.print("a");				//can be interrupted by other Threads
			System.out.print("l");
			System.out.print("i");
			System.out.print("c");
			System.out.print("e\r\n");
		}
	}
	
	public void print2() {
		synchronized (o) {
//		synchronized (new Object()) {			//this won't work, use same lock!
			System.out.print("b");
			System.out.print("o");
			System.out.print("b\r\n");
		}
	}
}