package com.sl.stringbuffer;

public class Demo4_StringBufferReplace_Reverse {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("girl alice");
		System.out.println(sb);
		sb.replace(0, 4, "woman");
		System.out.println(sb);
		System.out.println(sb.reverse());
	}

}
