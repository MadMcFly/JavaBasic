package com.sl.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Test2_Client {

	public static void main(String[] args) throws IOException {
		String name = getFileName();
		File file = new File(name);
		
		Socket socket = new Socket("127.0.0.1", 12345);
		InputStream is = socket.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		PrintStream ps = new PrintStream(socket.getOutputStream());
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		
		ps.println(name);
		String res = br.readLine();
		
		if("exist".equals(res)) {
			System.out.println("file already in server, no need for upload...");
			socket.close();
		}else {
			byte[] b = new byte[8192];
			int len;
			while((len = bis.read()) != -1) {
				ps.write(b, 0, len);
			}
			bis.close();
			socket.close();
		}
	}

	private static String getFileName() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("please type file path:");
			String name = sc.nextLine();
			File f = new File(name);
			if(!f.exists()) {
				System.out.println("file doesn't exists...");
				continue;
			}
			if(f.isDirectory()) {
				System.out.println("the path is a directory, not a file...");
				continue;
			}
			return name;
		}
	}

}
