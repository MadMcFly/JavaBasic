package com.sl.gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Demo4_MouseKeyListener {

	public static void main(String[] args) {
		Frame f = new Frame("frame");
		Button b1 = new Button("button1");
		
		f.setSize(500,500);
		f.setLocation(500, 100);
		f.setVisible(true);
		
		f.setLayout(new FlowLayout());
		f.add(b1);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				
				System.exit(0);
			}
		});
		
		b1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				
			System.exit(0);
			}
		});
		
		b1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println(e.getKeyCode());
//				if(e.getKeyCode() == 32)
				if(e.getKeyCode() == KeyEvent.VK_SPACE)
					System.exit(0);
			}
		});
	}

}
