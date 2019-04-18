package com.sl.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Test1_Client {

	public static void main(String[] args) throws Exception, IOException {
		Socket socket = new Socket("127.0.0.1", 54321);
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintStream ps = new PrintStream(socket.getOutputStream());
		
		Scanner sc = new Scanner(System.in);
		ps.println(sc.nextLine());
		System.out.println(br.readLine());
		
		socket.close();
		sc.close();
	}

}
