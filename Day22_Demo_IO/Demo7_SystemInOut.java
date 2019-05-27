package com.sl.otherio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class Demo7_SystemInOut {

	public static void main(String[] args) throws IOException {
//		demo1();
		System.setIn(new FileInputStream("a.txt"));
		System.setOut(new PrintStream("b.txt"));
		
		InputStream is = System.in;
		PrintStream ps = System.out; 
		int b;
		while((b = is.read()) != -1) {
			ps.write(b);
		}
		is.close();
		ps.close();
	}

	private static void demo1() throws IOException {
		InputStream fis = System.in;
		PrintStream ps = System.out;
		
		int b;
		b = fis.read();		//4
		ps.println(b);		//52	from ASCII charset
	}

}
