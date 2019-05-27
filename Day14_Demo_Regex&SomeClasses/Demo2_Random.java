package com.sl.otherclass;

import java.util.Random;

public class Demo2_Random {

	public static void main(String[] args) {
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			System.out.println(r.nextInt(100));
		}
		
		//if seed is set to a certain value, then every time r generates 
		//random numbers, they will start with the same
	}

}
