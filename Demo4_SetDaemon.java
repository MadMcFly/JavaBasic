package com.sl.method;

public class Demo4_SetDaemon {

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for(int i = 0; i < 2; i++) {
					System.out.println(getName() + "..aaa");
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i = 0; i < 50; i++) {
					System.out.println(this.getName() + "..bb");
				}
			}
		};
		
		t2.setDaemon(true);
		t2.start();
		t1.start();
	}

}
