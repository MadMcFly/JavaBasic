package com.sl.regex;

public class Demo7_GroupByRegex {

	public static void main(String[] args) {
		demo1();
//		demo2();
//		demo3();
	}

	private static void demo3() {
		String s = "我....我我我我我..我爱爱..爱....爱编程";
		s = s.replaceAll("\\.", "");			//since (.) represents all
												//use \\. to represents .
		System.out.println(s);
		String regex = "(.)\\1+";
		s = s.replaceAll(regex, "$1");			//$1 : what's in group 1
		System.out.println(s);
		System.out.println("$1");	 			//but it's not a String!
	}

	private static void demo2() {
		String s = "addlliunfnnnjfuinffsss";	//remove all duplicates
		String regex = "(.)\\1+";
		String[] sArr = s.split(regex);
		for (int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]);
		}
	}

	private static void demo1() {
		String regex = "(.)\\1{1}(.)\\2";			//\\1 = \\1{1}
													//(.) already one time
		System.out.println("aaabbb".matches(regex));
		System.out.println("aabb".matches(regex));
		System.out.println("glgl".matches(regex));
		System.out.println("-------------------");
		
		String regex2 = "(..)\\1";
		System.out.println("aaabbb".matches(regex2));
		System.out.println("aabb".matches(regex2));
		System.out.println("glgl".matches(regex2));
	}

}
