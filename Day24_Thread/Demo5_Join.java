package com.sl.method;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Demo5_Join {

	public static void main(String[] args) {
		final Thread t1 = new Thread() {
			public void run() {
				for(int i = 0; i < 100; i++)
					System.out.println(this.getName() + "..aaa");
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i = 0; i < 100; i++) { 
					if(i == 2) {
						try {
//							t1.join();
							t1.join(1);
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
					}
					System.out.println(this.getName() + "..bb");
				}
			}
		};
		
		t1.start();
		t2.start();
	}

}
