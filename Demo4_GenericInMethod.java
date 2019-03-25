package com.sl.generic;

import com.sl.bean.Tool;

public class Demo4_GenericInMethod {

	public static void main(String[] args) {
		Tool<String> t = new Tool<>();
		t.show("abc");
	}

}
