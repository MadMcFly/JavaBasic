package com.sl.otherclass;

import java.util.Arrays;

public class Demo3_System {

	public static void main(String[] args) {
//		demo1();
//		demo2();
//		demo3();
		int[] src = {1,2,3,4,5};
		int[] dest = new int[9];
		System.out.println(Arrays.toString(dest));
		System.arraycopy(src, 0, dest, 4, 5);
		System.out.println(Arrays.toString(dest));
		
	}

	private static void demo3() {
		long t1 = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			System.out.println("*");
		}
		long t2 = System.currentTimeMillis();
		System.out.println(t2 - t1);
	}

	private static void demo2() {
		System.exit(0);
		System.out.println("excuted?");
	}

	private static void demo1() {
		for (int i = 0; i < 100; i++) {
			new demo();
			System.gc();
		}
	}

}

class demo {

	@Override
	protected void finalize() {
		System.out.println("trash cleaned!");
	}
	
}