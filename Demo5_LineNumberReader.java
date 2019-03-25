package com.sl.chario;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Demo5_LineNumberReader {

	public static void main(String[] args) throws IOException {
		LineNumberReader lnr = new LineNumberReader(new FileReader("xxx.txt"));
		
		String line;
		
		lnr.setLineNumber(111);
		while((line = lnr.readLine()) != null) {
			System.out.println(lnr.getLineNumber() + ": " + line);
		}
		
		lnr.close();
	}

}
