package com.sl.test;

import java.math.BigInteger;

public class Test6_Factorial {

	public static void main(String[] args) {
//		demo1();	//num of zeros in 1000! = 472
		demo2();    //num of zeros ends in 1000! = 249
	}

	private static void demo2() {
		BigInteger bi1 = new BigInteger("1");
		for(int i = 1; i <= 1000; i++) {
			BigInteger bi2 = new BigInteger("" + i);
			bi1 = bi1.multiply(bi2);
		}
		
		String s = new StringBuffer(bi1.toString()).reverse().toString();
		int res = 0;
		for(int j = 0; j < s.length(); j++) {
			if('0' == s.charAt(j))
				res++;
			else
				break;
		}
		System.out.println(res);
	}

	private static void demo1() {
		BigInteger bi1 = new BigInteger("1");
		for(int i = 1; i <= 1000; i++) {
			BigInteger bi2 = new BigInteger("" + i);
			bi1 = bi1.multiply(bi2);
		}
		
		String s = bi1.toString();
		int res = 0;
		for(int j = 0; j < s.length(); j++) {
			if('0' == s.charAt(j))
				res++;
		}
		System.out.println(res);
	}

}
