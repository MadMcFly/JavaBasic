package com.sl.gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Demo5_ActionListener {

	public static void main(String[] args) {
		Frame f = new Frame("frame");
		Button b1 = new Button("button1");
		Button b2 = new Button("b2");
		
		f.setSize(500,500);
		f.setLocation(500, 100);
		f.setVisible(true);
		
		f.setLayout(new FlowLayout());
		f.add(b1);
		f.add(b2);
		
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
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

}
