package com.sl.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Test1_RevTxtFile {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
		
		ArrayList<String> list = new ArrayList<>();
		String line;
		
		while((line = br.readLine()) != null) {
			list.add(line);
		}
		
		br.close();			//for streams open as late as possible
										//close as early as possible
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("revxxx.txt"));
		
		for(int i = list.size() - 1; i >= 0; i--) {
			bw.write(list.get(i));
			bw.newLine();			//"\r\n"
		}
		
		bw.close();
	}

}
