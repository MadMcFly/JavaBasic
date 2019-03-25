package com.sl.exception;

public class Demo4_Throwable {

	public static void main(String[] args) {
		try {
			int c = 1 / 0;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e); 				//toString()
			e.printStackTrace();
		}
	}

}
