package com.sl.method;

public class Demo3_Sleep {

	public static void main(String[] args) throws InterruptedException {
//		demo1();
		new Thread() {
			public void run() {
				for(int i = 0; i < 10; i++) {
					System.out.println(getName() + "..aaa");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				for(int i = 0; i < 10; i++) {
					System.out.println(getName() + "..bb");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
			}
		}.start();
	}

	private static void demo1() throws InterruptedException {
		for (int i = 10; i > 0; i--) {
			System.out.println("countdown " + i + " second(s)...");
			Thread.sleep(1000);
		}
		System.out.println("boom...");
	}

}
