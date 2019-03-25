package com.sl.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test6_SortInputIntNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Integer> ts = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				int num = o2.compareTo(o1);
				return num == 0 ? 1 : num;
			}
		});
		while(true) {
			System.out.println("please type int number, end with quit:");
			String s = sc.nextLine();
			if("quit".equals(s)) {
				break;
			}
			try {
				ts.add(Integer.parseInt(s));
			} catch (Exception e) {
				System.out.println("invalid input");
			}
		}
		System.out.println(ts);
	}

}
