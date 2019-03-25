package com.sl.test;

import java.util.Scanner;

public class Test5_Fibonacci {

	public static void main(String[] args) {
//		demo1(); 			//dynamic programming
		int res = recursion(8);
		System.out.println(res);
	}

	public static int recursion(int i) {
		if(i == 1 || i == 2)
			return 1;
		else
			return recursion(i - 2) + recursion(i - 1);
	}

	private static void demo1() {
		int len;
		Scanner sc = new Scanner(System.in);
		len = sc.nextInt();
		int[] fib = new int[len];
		fib[0] = fib[1] = 1;
		for(int i = 2; i < len; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		System.out.println(fib[len - 1]);
	}

}
