package com.sl.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Demo2_Client {

	public static void main(String[] args) throws Exception, IOException {
		Socket socket = new Socket("127.0.0.1", 12345);
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		PrintStream ps = new PrintStream(os);
		
		System.out.println(br.readLine());
		Thread.sleep(1000);
		ps.println("where am I?");
		System.out.println(br.readLine());
		
		socket.close();
	}

}
