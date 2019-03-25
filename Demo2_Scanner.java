package com.sl.demo_scanner;

import java.util.Scanner;

public class Demo2_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*System.out.println("type first int number:");
		int i = sc.nextInt();
		System.out.println("type second int number:");
		int j = sc.nextInt();
		System.out.println("i = " + i + ", j = " + j);*/
		
		/*System.out.println("type first String:");
		String line1 = sc.nextLine();
		System.out.println("type second String:");
		String line2 = sc.nextLine();
		System.out.println("line1 = " + line1 + ", line2 = " + line2);*/
		
		/*System.out.println("type first int number:");
		int i = sc.nextInt();
		System.out.println("type second String:");
		String line2 = sc.nextLine();
		System.out.println("i = " + i + ", line2 = " +line2);*/
		
		/*result:
		 * type first int number:
			12
			type second String:
			i = 12, line2 = 
			since nextLine() method will end when receiving /r/n
			so there is nothing in line2
		 */
		/*
		 * solution:
		 * 1.use two Scanners, will cost more space in heap
		 * 2.use input hint"type an int and a String use space to separate them", but error may still happen
		 * 3.use two nextLine() method to receive
		 * */
		System.out.println("type first int number:");
		String line1 = "00";
		if(sc.hasNextInt()) {
			line1 = sc.nextLine();
		}else {
			System.out.println("wrong input data type, run again");
			return;
		}
		System.out.println("type second String:");
		String line2 = sc.nextLine();
		System.out.println("line1 = " + line1 + ", line2 = " + line2);
	}
}
