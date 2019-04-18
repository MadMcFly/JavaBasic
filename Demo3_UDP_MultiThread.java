package com.sl.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Demo3_UDP_MultiThread {

	public static void main(String[] args) {
		new Receive().start();
		new Send().start();
	}

}

class Receive extends Thread {
	@Override
	public void run() {
		try {
			DatagramSocket socket = new DatagramSocket(6666);
			DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
			while (true) {
				socket.receive(packet);

				byte arr[] = packet.getData();
				int len = packet.getLength();
				String ip = packet.getAddress().getHostAddress();
				int port = packet.getPort();
				System.out.println(ip + ": " + port + ": " + new String(arr, 0, len));

			} 
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getLocalizedMessage());
		}
	}
	
}

class Send extends Thread {
	@Override
	public void run() {
Scanner sc = new Scanner(System.in);
		
		try {
			DatagramSocket socket = new DatagramSocket();
			while (true) {
				String s = sc.nextLine();
				if ("quit".equals(s))
					break;
				DatagramPacket packet = new DatagramPacket(s.getBytes(), s.getBytes().length,
						InetAddress.getByName("127.0.0.1"), 6666);
				socket.send(packet);
			}

			socket.close();
			sc.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getLocalizedMessage());
		}
	}
}