package com.sl.stringbuffer;

public class Demo1_StringBufferConstructor {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		sb = new StringBuffer(10);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		sb = new StringBuffer("abc");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}

}
