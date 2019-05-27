package com.sl.map;

public class Demo4_MapEntry {

	public static void main(String[] args) {

	}

}

interface Inter1 {
	interface Inter2 {
		void show();
	}
}

class Demo implements Inter1.Inter2 {		//interface in another interface

	@Override
	public void show() {
	}
	
}