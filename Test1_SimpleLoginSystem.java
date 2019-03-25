package com.sl.test;

import java.util.Scanner;

public class Test1_SimpleLoginSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			System.out.println("Please enter user name:");
			String userName = sc.nextLine();
			System.out.println("Please enter password:");
			String password = sc.nextLine();
			if("admin".equals(userName) && "admin".equals(password)) {
				System.out.println("welcome admin!");
				break;
			}else {
				if(i == 2) {
					System.out.println("chances used up, see you tomorrow.(- -)/~");
				}else {
					System.out.println("username or password invalid, " + (2-i) + " chance(s) left.");
				}
			}
		}
	}

}
