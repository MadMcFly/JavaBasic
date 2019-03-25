package com.sl.test;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("type a string, ended with enter:");
		String s = sc.nextLine();
		char[] arr = s.toCharArray();
//		method1(arr);
		method2(arr);
	}

	private static void method2(char[] arr) {
		String s1 = "";
		for (int i = arr.length - 1; i >=0; i--) {
			s1 = s1 + arr[i];
		}
		System.out.println(s1);
	}

	private static void method1(char[] arr) {
		for(int i = 0; i < arr.length/2; i++) {
			char temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		String s1 = new String(arr);
		System.out.println(s1);
	}

}
