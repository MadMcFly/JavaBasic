package com.sl.stringbuffer;

public class Demo7_StringBufferAsParameter {

	public static void main(String[] args) {
		String s = "alice";
		System.out.println(s);
		change(s);
		System.out.println(s); 			//the value of String can't be changed after initialization
		
		System.out.println("-------------");
		
		StringBuffer sb = new StringBuffer("alice");
		System.out.println(sb);
		change(sb);
		System.out.println(sb);
	}

	public static void change(StringBuffer sb) {
		sb.append("girl");
	}

	public static void change(String s) {
		s += "girl";
	}

}
