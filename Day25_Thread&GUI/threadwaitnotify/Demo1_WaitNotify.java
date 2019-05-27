package com.sl.threadwaitnotify;

public class Demo1_WaitNotify {

	public static void main(String[] args) {
		Printer p = new Printer();
		
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
	}

}

class Printer {
	private boolean flag = true;
	public synchronized void print1() throws InterruptedException {
		if(!flag)
			this.wait();
		System.out.println("alice");
		flag = false;
		this.notify();
	}
	
	public synchronized void print2() throws InterruptedException {
//		synchronized (Printer.class) {}
		if(flag)
			this.wait();
		System.out.println("bob");
		flag = true;
		this.notify();
	}
}