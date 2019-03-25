package com.sl.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test5_SortCharInStringKeepDuplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please type an input string:");
		String s = sc.nextLine();
		char[] arr = s.toCharArray();
		sort(arr);
	}				

	private static void sort(char[] arr) {
		TreeSet<Character> ts = new TreeSet<>(new Comparator<Character>() {

			@Override
			public int compare(Character o1, Character o2) {
				int num = o1.compareTo(o2);
				return num == 0 ? 1 : num;
			}
		});
		for (int i = 0; i < arr.length; i++) {
			ts.add(arr[i]);
		}
		System.out.println(ts);
	}

}
