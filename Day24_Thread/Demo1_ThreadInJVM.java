package com.sl.thread;

public class Demo1_ThreadInJVM {
	public static void main(String[] args) {
		for(int i = 0; i < 1000000; i++) {
			new Demo();
			System.out.println(i);
		}
		System.out.println("complete");
		for(int i = 0; i < 1000; i++) {
			System.out.println("main process");
		}
	}
}

class Demo {

	@Override
	public void finalize() {
//		int i = 1 / 0;
		System.out.println("garbage collected");
	}
	
}