package com.sl.warpclass;

public class Demo1_Integer {

	public static void main(String[] args) {
//		demo1();
		System.out.println(Integer.MAX_VALUE);		//2^31 - 1
		System.out.println(Integer.MIN_VALUE);		//-2^31
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer("100");
//		Integer i3 = new Integer("abc");		//java.lang.NumberFormatException
		System.out.println(i1 + i2);
	}

	private static void demo1() {
		System.out.println(Integer.toString(60));
		System.out.println(Integer.toBinaryString(60));
		System.out.println(Integer.toHexString(60));
		System.out.println(Integer.toOctalString(60));
	}

}
