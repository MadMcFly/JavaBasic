package com.sl.chario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo4_BufferedMethod {

	public static void main(String[] args) throws IOException {
//		demo1();
		BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("aaa.txt"));
		
		String line;
		while((line = br.readLine()) != null) {		//return null at end of file
			bw.write(line);
//			bw.newLine();			//in all platform -systems
			bw.write("\r\n"); 		//\r\n in Windows
									//\n in Linux
									//\r in Mac
		}
		
		br.close();
		bw.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
//		BufferedWriter bw = new BufferedWriter(new FileWriter("aaa.txt"));
		
		String line;
		while((line = br.readLine()) != null) {
//			System.out.println(line);		//BR.readLine() get a String of the entire
											//line without \r\n
			System.out.print(line);			//all in the first row
		}
		
		br.close();
	}

}
