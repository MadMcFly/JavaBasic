package com.sl.regex;

public class Demo4_SplitRegex {

	public static void main(String[] args) {
		String s = "alice bob chris";
		String[] arr = s.split(" ");		//regex = " "
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
