package com.sl.test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Test2_TryCatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("type a integer as input:");
		while (true) {
			String line = sc.nextLine();
			try {
				int i = Integer.parseInt(line);
				System.out.println(Integer.toBinaryString(i));
				break;
			} catch (NumberFormatException e) {
				try {
					new BigInteger(line);
					System.out.println("number is too large, please re-input:");
				} catch (Exception e1) {
					try {
						new BigDecimal(line);
						System.out.println("number is a decimal, please re-input:");
					} catch (Exception e2) {
						System.out.println("wrong input, please re-input:");
					}
				}
			} 
		}
	}

}
