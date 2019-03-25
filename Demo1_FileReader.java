package com.sl.chario;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo1_FileReader {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("xxx.txt");
		
		int ch;
		while((ch = fr.read()) != -1) {
			System.out.print((char)ch);
		}
		
		fr.close();
	}

}
