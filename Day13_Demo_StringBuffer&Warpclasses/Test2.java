package com.sl.Test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("type a string ends with enter:");
		String s = sc.nextLine();
		System.out.println(revString(s));
	}
	
	public static String revString(String line) {
		StringBuffer sb = new StringBuffer(line);
		
		return sb.reverse().toString();
	}
}
