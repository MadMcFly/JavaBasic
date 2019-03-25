package com.sl.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

public class Test2_CharNum {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
		TreeMap<Character, Integer> tm = new TreeMap<>();
		int a;
		while((a = br.read()) != -1) {
			char c = (char)a;
			tm.put(c, tm.getOrDefault(c, 0) + 1);
		}
		br.close();
		System.out.println(tm);
		BufferedWriter bw = new BufferedWriter(new FileWriter("time.txt"));
		for (Character c : tm.keySet()) {
			switch (c) {
			case '\r':
				bw.write("\\r" + " = " + tm.get(c));
				break;
			case '\n':
				bw.write("\\n" + " = " + tm.get(c));
				break;

			default:
				bw.write(c + " = " + tm.get(c));
				break;
			}
			bw.newLine();
		}
		bw.close();
	}

}
