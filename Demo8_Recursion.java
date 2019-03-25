package com.sl.chario;

public class Demo8_Recursion {

	public static void main(String[] args) {
		System.out.println(fun(5));
	}
	
	public static int fun(int i) {
		if(i <= 0) {
			System.out.println("error");
			return 0;
		}
		return i == 1 ? 1 : i * fun(i - 1);
	}
}
