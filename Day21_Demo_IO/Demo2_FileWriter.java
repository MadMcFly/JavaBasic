package com.sl.chario;

import java.io.FileWriter;
import java.io.IOException;

public class Demo2_FileWriter {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("yyy.txt");
		fw.write("hello!");
		fw.write(97);
		
		fw.close();
	}

}
