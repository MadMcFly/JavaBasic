package com.sl.stringbuffer;

public class Demo5_StringBufferSubstring {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("this is alice");
		
		String s = sb.substring(8);			//StringBuffer obj.subString() will return a String!!!!
		System.out.println(s);
		s = sb.substring(5, 7);
		System.out.println(s);
	}

}
