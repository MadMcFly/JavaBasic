package com.sl.otherclass;

import java.util.Date;

public class Demo6_Date {

	public static void main(String[] args) {
//		demo1();
//		demo2();
		demo3();
	}

	private static void demo3() {
		Date d1 = new Date();
		System.out.println(d1);
		d1.setTime(1000);
		System.out.println(d1);
	}

	private static void demo2() {
		Date d1 = new Date();
		System.out.println(d1.getTime());				//can be different
		System.out.println(System.currentTimeMillis());
	}

	private static void demo1() {
		Date d1 = new Date();
		System.out.println(d1);
		
		Date d2 = new Date(0);		//central time 1970 1/1 00:00:00
		System.out.println(d2);		//different for different local
	}

}
