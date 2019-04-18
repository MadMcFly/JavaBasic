package com.sl.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test1_Server {

	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(54321);
		while (true) {
			Socket socket = ss.accept();			//out of thread...
													//no socket no need for thread
			new Thread() {
				@Override
				public void run() {
					
					try {
						BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
						PrintStream ps = new PrintStream(socket.getOutputStream());
						String s = br.readLine();
						ps.println(new StringBuffer(s).reverse() + "");
						socket.close();
					} catch (IOException e) {
						
						e.printStackTrace();
					}
				}
			}.start();
		}
	}

}
