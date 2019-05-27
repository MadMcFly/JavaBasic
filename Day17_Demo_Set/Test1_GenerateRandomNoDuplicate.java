package com.sl.test;

import java.util.HashSet;
import java.util.Random;

public class Test1_GenerateRandomNoDuplicate {

	public static void main(String[] args) {
		Random r = new Random();
		HashSet<Integer> hs = new HashSet<>();
		while(hs.size() < 10) {
			hs.add(r.nextInt(20) + 1);			//Integer from 1 - 20
		}
		
		for (Integer integer : hs) {
			System.out.println(integer);
		}
	}

}
