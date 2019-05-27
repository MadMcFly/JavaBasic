package com.sl.test;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Test2_RemoveDuplicateInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("type a string, we will remove duplicate:");
		String s = sc.nextLine();
		LinkedHashSet<Character> hs = new LinkedHashSet<>();
		char[] arr = s.toCharArray();
		for (char c : arr) {
			hs.add(c);
		}
		System.out.print(hs);
	}

}
