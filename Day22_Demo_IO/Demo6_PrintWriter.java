package com.sl.otherio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Demo6_PrintWriter {

	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter(new FileOutputStream("f.txt"), true);
		pw.print("aaa");
		pw.print("\r\n");
		pw.println(); 			//autoflush only works for println() method
		pw.close();
	}

}
