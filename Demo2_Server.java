package com.sl.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo2_Server {

	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(12345);
		while (true) {
			Socket socket = server.accept();
			new Thread() {
				@Override
				public void run() {
					
					try {
						InputStream is = socket.getInputStream();
						OutputStream os = socket.getOutputStream();
						BufferedReader br = new BufferedReader(new InputStreamReader(is));
						PrintStream ps = new PrintStream(os);
						ps.println("welcome...");
						System.out.println(br.readLine());
						Thread.sleep(1000);
						ps.println("this is google!");
						
						socket.close();
					} catch (IOException e) {
						
						e.printStackTrace();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
			}.start();
		}
	}

}
