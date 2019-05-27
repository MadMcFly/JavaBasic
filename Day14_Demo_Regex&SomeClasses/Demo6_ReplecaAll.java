package com.sl.regex;

public class Demo6_ReplecaAll {

	public static void main(String[] args) {
		String s = "alice111likes234bob";
		String regex = "\\d+";
		String s2 = s.replaceAll(regex, " ");
		System.out.println(s2);
	}

}
