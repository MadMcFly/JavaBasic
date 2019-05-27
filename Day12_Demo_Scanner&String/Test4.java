package com.sl.test;

public class Test4 {
	public static void main(String[] args) {
		String s = "aliceandBOB";		//first letter upper case, else lower case
		String s1 = s.substring(0, 1).toUpperCase().concat(s.substring(1).toLowerCase());
		System.out.println(s1);
	}
}
