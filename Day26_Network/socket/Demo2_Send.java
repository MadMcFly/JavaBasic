package com.sl.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class Demo2_Send {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		DatagramSocket socket = new DatagramSocket();
		while(true) {
			String s = sc.nextLine();
			if("quit".equals(s))
				break;
			DatagramPacket packet = 
					new DatagramPacket(s.getBytes(), s.getBytes().length, InetAddress.getByName("127.0.0.1"), 6666);
			socket.send(packet);
		}
		
		socket.close();
		sc.close();
	}

}
