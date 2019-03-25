package com.sl.threadwaitnotify;

public class Demo2_NotifyAll {

	public static void main(String[] args) {
		Printer2 p = new Printer2();
		new Thread() {
			public void run() {
				while(true) {
					try {
						p.print1();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}	
			}
		}.start();
	
		new Thread() {
			public void run() {
				while(true)
					try {
						p.print2();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true)
					try {
						p.print3();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
			}
		}.start();
	}

}

class Printer2 {
	private int flag = 1;
	private Object obj = new Object();
	public void print1() throws InterruptedException {
		synchronized (obj) {
			
			while(flag != 1)						//using while, deadlock appears
				//notify() random one  
				obj.wait();
			System.out.println("alice");
			flag = 2;
//		this.notify();
			obj.notifyAll();						//works, notify all threads
		}
	}
	
	public void print2() throws InterruptedException {
//		synchronized (Printer.class) {}
		synchronized (obj) {
			while(flag != 2)						//"if" only judge once, use while
				obj.wait();
			System.out.println("bob");
			flag = 3;
			obj.notifyAll();						//won't change in three,
			//notify() random one  
			
		}
	}
	
	public void print3() throws InterruptedException {
		synchronized (obj) {
			
			while(flag != 3)
				obj.wait();
			System.out.println("cathy");
			flag = 1;
			obj.notifyAll();
		}
	}
}