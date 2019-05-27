package com.sl.gui;

import java.awt.Frame;
import java.awt.Toolkit;

public class Demo1_GUI {

	public static void main(String[] args) {
		Frame f = new Frame("my first frame!");
		f.setSize(500, 300);
		f.setLocation(500, 100);
//		f.setIconImage(Toolkit.getDefaultToolkit().createImage("facebook.png"));
		f.setVisible(true);
	}

}
