package com.sl.stringbuffer;

public class Demo6_StringBuffer_Transfer_String {

	public static void main(String[] args) {
//		demo1();
		demo2();
		
	}

	private static void demo2() {
		StringBuffer sb = new StringBuffer("alice");
		String s1 = new String(sb);
		System.out.println(s1);
		String s2 = sb.toString();
		System.out.println(s2);
		String s3 = sb.substring(0);			//or sb.substring(0, sb.length());
		System.out.println(s3);
	}

	private static void demo1() {
		String s = "alice";
		StringBuffer sb1 = new StringBuffer(s);
		System.out.println(sb1);
		StringBuffer sb2 = new StringBuffer();
		sb2.append(s);
		System.out.println(sb2);
	}

}
