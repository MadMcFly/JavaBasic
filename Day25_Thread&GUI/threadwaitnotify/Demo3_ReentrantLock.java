package com.sl.threadwaitnotify;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Demo3_ReentrantLock {

	public static void main(String[] args) {
		
		Printer3 p = new Printer3();
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

class Printer3 {
	private int flag = 1;
	
	private ReentrantLock r = new ReentrantLock();
	private Condition c1 = r.newCondition();
	private Condition c2 = r.newCondition();
	private Condition c3 = r.newCondition();
	
	public void print1() throws InterruptedException {
		r.lock();
		
		if(flag != 1)						//using while, deadlock appears
			//notify() random one  
			c1.await();
		System.out.println("alice");
		flag = 2;
//		this.notify();
		c2.signal();
		
	}
	
	public void print2() throws InterruptedException {
//		synchronized (Printer.class) {}
		r.lock();
		if(flag != 2)						//"if" only judge once, use while
			c2.await();
		System.out.println("bob");
		flag = 3;
		c3.signal(); 
		
		
	}
	
	public void print3() throws InterruptedException {
		r.lock();
		
		if(flag != 3)
			c3.await();
		System.out.println("cathy");
		flag = 1;
		c1.signal();
		}
	
}