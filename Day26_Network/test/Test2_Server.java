package com.sl.test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test2_Server {

	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(12345);
		System.out.println("server started, port# is 12345...");
		File dir = new File("server");
		dir.mkdir();
		
		while(true) {
			Socket socket = server.accept();
			new Thread() {
				@Override
				public void run() {
					try {
						BufferedReader br = 
								new BufferedReader(new InputStreamReader(socket.getInputStream()));
						PrintStream ps = new PrintStream(socket.getOutputStream());
						
						String name = br.readLine();
						File file = new File(dir, name);
						
						if(file.exists()) {
							ps.println("exist");
							socket.close();
						}else {
							ps.println("non-exist");
						}
						
						FileOutputStream fos = new FileOutputStream(file);
						BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
						
						byte[] b = new byte[8192];
						int len;
						while((len = bis.read(b)) != -1) {
							fos.write(b, 0, len);
						}
						
						fos.close();
						socket.close();
					} catch (IOException e) {
						
						e.printStackTrace();
					}
				}
			}.start();
		}
	}

}
