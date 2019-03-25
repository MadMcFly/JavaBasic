package com.sl.string;

import com.sl.javabean.Person;

public class Demo6_StringMehtodTranserFromString {

	public static void main(String[] args) {
//		demo1();
//		demo2();
//		demo3();
		demo4();
	}

	private static void demo4() {
		String s = "coderLYS";
		String s1 = s.toLowerCase();
		String s2 = s.toUpperCase();
		String s3 = s1.concat(s2);
		System.out.println(s3);
	}

	private static void demo3() {
		char[] arr = {'a', 'b', 'c'};
		String s1 = String.valueOf(arr);		//method valueOf(), called by class String--->static method
		System.out.println(s1);
		int i = 100;
		String s2 = String.valueOf(i);
		System.out.println(s2 + 100);
		Person p = new Person("alice", 12);
		System.out.println(String.valueOf(p));	//for object, valueOf() is using toString() method
	}

	private static void demo2() {
		String s = "lsysbt";
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private static void demo1() {
		String s = "abc";
		byte[] arr = s.getBytes();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);			//Cp1252 encoding
		}
	}

}
