package com.sl.socket;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo4_GUIChat extends Frame{
	
	private Button send;
	private Button log;
	private Button clear;
	private Button shake;
	private TextField tf;
	private TextArea viewText;
	private TextArea sendText;
	private DatagramSocket socket;
	private BufferedWriter bw;

	public Demo4_GUIChat() {
		init();
		southPanel();
		centerPanel();
		
		event();
	}		
	
	public void event() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				socket.close();
				System.exit(0);
			}
		});
		
		send.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					send();
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
			}
		});
		
		clear.addActionListener(new  ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				viewText.setText("");
			}
		});
		
		log.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					bw.flush();
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
				logFile();
			}
		});
		
		shake.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				shake();
				try {
					send(new byte[]{-1}, tf.getText());
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
			}
		});
		
		sendText.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER && e.isControlDown())
					try {
						send();
					} catch (Exception e1) {
						
						e1.printStackTrace();
					}
				
			}
		});
	}

	private void shake() {
		int x = this.getLocation().x;
		int y = this.getLocation().y;
		
		for (int i = 0; i < 5; i++) {
			try {
				this.setLocation(x + 20, y + 20);
				Thread.sleep(50);
				this.setLocation(x + 20, y - 20);
				Thread.sleep(50);
				this.setLocation(x - 20, y - 20);
				Thread.sleep(50);
				this.setLocation(x - 20, y + 20);
				Thread.sleep(50);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}

	private void logFile() {
		try {
			FileInputStream fis = new FileInputStream("config.txt");
			int len;
			byte[] b = new byte[8192];
			StringBuffer sb = new StringBuffer();
			
			while((len = fis.read(b)) != -1) {
				sb.append(new String(b, 0, len));
			}
			viewText.setText(sb.toString());
			
			fis.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
			
	}
	
	private void send(byte[] arr, String ip) throws Exception {
		DatagramPacket packet =
				new DatagramPacket(arr, arr.length, InetAddress.getByName(ip), 9999);
		socket.send(packet);
	}
	
	private void send() throws Exception {
		String message = sendText.getText();
		String ip = tf.getText().trim();
		ip = "".equals(ip) ? "255.255.255.255" : ip;
		send(message.getBytes(), ip);
		
		String time = getCurrentTime();
		String str = time + ", I send to " + ("255.255.255.255".equals(ip) ? "Everyone!" : ip) + "\r\n" + message + "\r\n\r\n";
		
		viewText.append(str);
		bw.write(str);
		sendText.setText("");
	}

	private String getCurrentTime() {
		Date d = new java.util.Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		return sdf.format(d);
	}

	public void init() {
		this.setLocation(500, 50);
		this.setSize(500, 800);
		try {
			socket = new DatagramSocket();
			bw = new BufferedWriter(new FileWriter("config.txt", true));
		} catch (SocketException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		new receive().start();
		this.setVisible(true);
	}
	
	public void centerPanel() {
		Panel center = new Panel();
		viewText = new TextArea();
		sendText = new TextArea(5, 1);

		center.setLayout(new BorderLayout());
		viewText.setEditable(false);
		viewText.setBackground(Color.WHITE);
		viewText.setFont(new Font("my font", Font.PLAIN, 20));
		sendText.setFont(new Font("my font", Font.PLAIN, 20));
		
		center.add(viewText, BorderLayout.CENTER);
		center.add(sendText, BorderLayout.SOUTH);		
		this.add(center);							//center of frame by default
	}

	public void southPanel() {
		Panel south = new Panel();
		
		tf = new TextField(15);
		send = new Button("send");
		log = new Button("log");
		clear = new Button("clear");
		shake = new Button("shake");
		tf.setText("127.0.0.1");
		
		south.add(tf);
		south.add(send);
		south.add(log);
		south.add(clear);
		south.add(shake);
		this.add(south, BorderLayout.SOUTH);
	}

	private class receive extends Thread {
		@Override
		public void run() {
			try {
				DatagramSocket socket = new DatagramSocket(9999);
				DatagramPacket packet = new DatagramPacket(new byte[8192], 8192);
				while (true) {
					socket.receive(packet);
					String time = getCurrentTime();
					String ip = packet.getAddress().getHostAddress();
					byte[] arr = packet.getData();
					int len = packet.getLength();
					
					if(len == 1 && arr[0] == -1) {
						shake();
//						System.out.println(arr.length);
						continue;
					}
					
					String message = new String(arr, 0, len);
					String str = time + ", " + ip + " send to me " + "\r\n" + message + "\r\n\r\n";
					viewText.append(str);
					bw.write(str);
				}
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
	} 
	
	public static void main(String[] args) {
		new Demo4_GUIChat();
		
	}

}
