package com.sl.exception;

public class Demo2_TryCatch {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {
			int c = a / b;
			System.out.println(c);
		} catch(ArithmeticException ae) {
			System.out.println("ae exception happened, can't be divided by 0");
		}
		
		System.out.println("using try...catch... won't affect rest of the code");
	}

}
