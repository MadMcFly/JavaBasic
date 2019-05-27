package com.sl.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo7_PatternMatcher {

	public static void main(String[] args) {
//		demo1();
		String s = "my phone number was: 18988888888, I have used 13812345678";
		String regex = "1[3578]\\d{9}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);
//		System.out.println(m.find());
		
		while(m.find()) {
			System.out.println(m.group());
		}
	}

	private static void demo1() {
		Pattern p = Pattern.compile("a*b");
		Matcher m = p.matcher("aaab");
		boolean b = m.matches();
		System.out.println(b);
		
		System.out.println("aaab".matches("a*b"));
	}

}
