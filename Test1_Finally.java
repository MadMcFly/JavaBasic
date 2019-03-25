package com.sl.test;

public class Test1_Finally {

	public static void main(String[] args) {
		System.out.println(new Demo().show());
	}

}

class Demo {
	int x = 10;
	public int show() {
		try {
			x = 10;
			int a = 1/0;
			return x;
		} catch (Exception e) {
			x = 20;
			System.out.println("can't be devided by 0");
			return x;
		} finally {
			System.out.println("finally executed?");
			x = 30;
		}
	}
}