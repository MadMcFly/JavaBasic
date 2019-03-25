package com.sl.method;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Demo7_SetPriority {

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for(int i = 0; i < 1000; i++)
					System.out.println(this.getName() + "..aaa");
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i = 0; i < 1000; i++) { 
					System.out.println(this.getName() + "..bb");
				}
			}
		};
		
//		t1.setPriority(1);
		t1.setPriority(Thread.MAX_PRIORITY);
//		t2.setPriority(10);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
	}

}
