package com.sl.string;

public class Demo7 {

	public static void main(String[] args) {
		String s = "lsysbt";
		String s1 = s.replace('s', 'v');
		System.out.println(s1);
		String s2 = s.replace("sy", "ii");
		System.out.println(s2);
		System.out.println(s.compareTo(s1));	//minus using asic encoding
		
		String ss1 = "abcde";
		String ss2 = "abcd";
		System.out.println(ss1.compareTo(ss2));	//the difference of length if the longer String "has" the shorter
		
		String ss3 = "ABCDE";
		System.out.println(ss1.compareToIgnoreCase(ss3));		//the same when ignoring case!
	}

}
