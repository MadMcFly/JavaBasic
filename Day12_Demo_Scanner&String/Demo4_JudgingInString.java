package com.sl.string;

public class Demo4_JudgingInString {

	public static void main(String[] args) {
//		demo1();
//		demo2();
		demo3();
	}

	private static void demo3() {
		String s1 = "abc";
		String s2 = "";
		String s3 = null;
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());		//"" is String constant, also a String class obj
												//s2 can call method of String class
		
		//System.out.println(s3.isEmpty());		//null is a special constant type
												//java.lang.NullPointerException
	}

	private static void demo2() {
		String s1 = "alice likes bob";
		String s2 = "alice";
		String s3 = "Alice";
		String s4 = "bob";
		System.out.println(s1.contains(s2));
		System.out.println(s1.contains(s3));
		System.out.println("---------------");
		System.out.println(s1.startsWith(s2));
		System.out.println(s1.startsWith(s4));
		System.out.println("-----------------");
		System.out.println(s1.endsWith(s2));
		System.out.println(s1.endsWith(s4));
	}

	private static void demo1() {
		String s1 = "abc";
		String s2 = "abc";
		String s3 = "ABC";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println("---------------");
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
	}

}
