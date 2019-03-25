package com.sl.exception;

public class Demo1_Exception {

	public static void main(String[] args) {
//		demo1();
		Demo d = new Demo();
		int c = d.div(10, 0);		//java.lang.ArithmeticException: / by zero
		System.out.println(c);
	}

	private static void demo1() {
		int[] arr = {1,2,3};
//		arr = null;					//java.lang.NullPointerException
		System.out.println(arr[10]);//java.lang.ArrayIndexOutOfBoundsException: 10
	}

}

class Demo {
	public int div(int a, int b) {
		return a / b;
	}
}