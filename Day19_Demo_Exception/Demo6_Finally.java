package com.sl.exception;

public class Demo6_Finally {

	public static void main(String[] args) {
		try {
			int a = 1/0;
		} catch (Exception e) {
			System.out.println("can't be divided by 0");
			System.exit(0);  								//not executed
			return;											//executed
		} finally {
			System.out.println("finally executed?");	 	//execute ?
		}
	}

}
