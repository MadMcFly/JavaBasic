package com.sl.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test3_TryFreeTimes {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("config.txt"));
		String line = br.readLine();
		br.close();
		
		int times = Integer.parseInt(line);
		
		System.out.println((times > 0 ? times-- : 0) + " chances remains");
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("config.txt"));
		bw.write(Integer.toString(times));
		bw.close();
	}

}
