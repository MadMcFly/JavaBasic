package com.sl.string;

public class Demo2_StringConstructor {
	public static void main(String[] args) {
		
		String s1 = new String();
		System.out.println(s1);
		
		byte[] bytes = {97,98,99,100,101,102};
		String s2 = new String(bytes);
		System.out.println(s2);
		String s3 = new String(bytes,3,3);
		System.out.println(s3);
		
		char[] chars = {'l','s','y','s','b','t'};
		String s4 = new String(chars);
		System.out.println(s4);
		String s5 = new String(chars,3,3);
		System.out.println(s5);
		
		String s6 = new String("abs");
		System.out.println(s6);
		String s7 = "abs";
		System.out.println(s7);
	}
}
