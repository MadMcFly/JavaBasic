package com.sl.list;

import java.util.Enumeration;
import java.util.Vector;

public class Demo5_Vector {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement("a");
		v.addElement("a");
		v.addElement("a");
		v.addElement("a");
		Enumeration en = v.elements();
		
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}

}
