package com.sl.test;

import java.util.Calendar;
import java.util.Scanner;

public class Test3_LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("type a year:");
		String s = sc.nextLine();
		int year = Integer.parseInt(s);
		System.out.println(getLeapYear(year) ? "leap year" : "normal year");
	}
	
	public static boolean getLeapYear(int year) {
		Calendar c = Calendar.getInstance();
		c.set(year, 1, 28);
		c.add(Calendar.DAY_OF_MONTH, 1);
		return c.get(Calendar.MONTH) == 1;
	}
}
