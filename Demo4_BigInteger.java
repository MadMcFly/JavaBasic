package com.sl.otherclass;

import java.math.BigInteger;
import java.util.Arrays;

public class Demo4_BigInteger {

	public static void main(String[] args) {
		BigInteger bi1 = new BigInteger("100");
		BigInteger bi2 = new BigInteger("2");
		
		System.out.println(bi1.add(bi2));
		System.out.println(bi1.subtract(bi2));
		System.out.println(bi1.multiply(bi2));
		System.out.println(bi1.divide(bi2));
		System.out.println(Arrays.toString(bi1.divideAndRemainder(bi2)));
	}

}
