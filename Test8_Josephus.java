package com.sl.test;

import java.util.ArrayList;

public class Test8_Josephus {

	public static void main(String[] args) {
		System.out.println(getLuckyNum(8));
	}

	public static int getLuckyNum(int num) {
		int res = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 1; i <= num; i++) {
			list.add(i);
		}
		System.out.println(list);
		int count = 1;
		for(int i = 0; list.size() != 1; i++) {
			if(i == list.size())
				i = 0;
			if(count % 3 == 0) {
				list.remove(i--);
			}
			count++;
		}
		System.out.println(list);
		res = list.get(0);
		return res;
	}
}
