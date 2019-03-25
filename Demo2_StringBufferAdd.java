package com.sl.stringbuffer;

public class Demo2_StringBufferAdd {

	public static void main(String[] args) {
//		demo1();
		StringBuffer sb = new StringBuffer();
		sb.append("1234");
		sb.insert(3, "alice");					//if int offset not in range of index, Exception!!!
		System.out.println(sb);
	}

	private static void demo1() {
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = sb.append(true);
		System.out.println(sb1);				//all point to same object sb
		StringBuffer sb2 = sb.append("alice");
		System.out.println(sb2);
		sb.append(100);
		
		System.out.println(sb1.toString());		//when doing print, call the toString() method by default
	}

}
