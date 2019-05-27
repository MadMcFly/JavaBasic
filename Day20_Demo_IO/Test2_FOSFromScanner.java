package com.sl.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test2_FOSFromScanner {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream("test2.txt");
		System.out.println("please type input here:(type \"quit\" to finish)");
		while(true) {
			String s = sc.nextLine();
			if("quit".equals(s))
				break;
			fos.write(s.getBytes());
			fos.write("\r\n".getBytes());
		}
		fos.close();
	}

}
