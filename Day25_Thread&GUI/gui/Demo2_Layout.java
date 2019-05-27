package com.sl.gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Demo2_Layout {

	public static void main(String[] args) {
		Frame f = new Frame("for layout");
		f.setSize(500,500);
		f.setLocation(500, 100);
		f.setVisible(true);
		
		Button b1 = new Button("button1");
		
		f.setLayout(new FlowLayout());
		f.add(b1);
	}

}
