package com.sl.chario;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class Demo7_TransIO {

	public static void main(String[] args) throws IOException {
//		demo1();
//		demo2();
		BufferedReader br = 					//buffered, 8192 char = 16KB
				new BufferedReader(new InputStreamReader(new FileInputStream("utf-8.txt"), "utf-8"));
	}

	private static void demo2() throws UnsupportedEncodingException, FileNotFoundException, IOException {
		InputStreamReader isr =					//one char each time to read
				new InputStreamReader(new FileInputStream("utf-8.txt"), "utf-8");
		OutputStreamWriter osw =
				new OutputStreamWriter(new FileOutputStream("cp1252.txt"), "utf-8");
		
		int c;
		
		while((c = isr.read()) != -1) {
			osw.write(c);
		}
		
		isr.close();
		osw.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("utf-8.txt");		//different charset
		FileWriter fw = new FileWriter("cp1252.txt");
		
		int c;
		
		while((c = fr.read()) != -1) {
			fw.write(c);
		}
		
		fr.close();
		fw.close();
	}

}
