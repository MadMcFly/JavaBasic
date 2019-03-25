package com.sl.synchronize;

public class Demo5_Deadlock {
	private static String s1 = "leftchopstick";
	private static String s2 = "rightchopstick";
	
	public static void main(String[] args) {
		new Thread() {
			public void run() {
				while(true) {
					synchronized (s1) {
						System.out.println(getName() + s1 + " get, wait for " + s2);
						synchronized (s2) {
							System.out.println(getName() + s2 + " get, all set");
						}
					}
					
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true) {
					synchronized (s2) {
						System.out.println(getName() + s2 + " get, wait for " + s1);
						synchronized (s1) {
							System.out.println(getName() + s1 + " get, all set");
						}
					}
					
				}
			}
		}.start();
	}

}
