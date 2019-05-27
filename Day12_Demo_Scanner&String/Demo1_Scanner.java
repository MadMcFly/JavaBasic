package com.sl.demo_scanner;

import java.util.Scanner;

public class Demo1_Scanner {
	public static void main(String[] args) {
		System.out.println("type a int number:");
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextInt()) {
			int i = sc.nextInt();
			System.out.println(i);
		}else {
			System.out.println("wrong input data type");
		}
	}
}
