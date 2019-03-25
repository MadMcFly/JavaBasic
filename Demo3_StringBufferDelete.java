package com.sl.stringbuffer;

public class Demo3_StringBufferDelete {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
//		sb.deleteCharAt(3);						//java.lang.StringIndexOutOfBoundsException
		sb.append("alice");
		sb.deleteCharAt(4);
		System.out.println(sb);
		sb.append('e');
		System.out.println(sb);
		sb.delete(0, 3);
		System.out.println(sb);
	}

}
