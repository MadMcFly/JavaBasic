package com.sl.test;

import java.util.ArrayList;
import java.util.Collections;

public class Test2_PokerGame {

	public static void main(String[] args) {
		String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] type = {"Spade ","Heart ","Plum ","Squre "};
		ArrayList<String> poker = new ArrayList<>();
		for(String s1 : type) {
			for(String s2 : num) {
				poker.add(s1.concat(s2));
			}
		}
		poker.add("big joker");
		poker.add("small joker");
		
		Collections.shuffle(poker);
		
		ArrayList<String> player1 = new ArrayList<>();
		ArrayList<String> player2 = new ArrayList<>();
		ArrayList<String> player3 = new ArrayList<>();
		ArrayList<String> hidden = new ArrayList<>();

		for (int i = 0; i < poker.size(); i++) {
			if(i >= poker.size() - 3) {
				hidden.add(poker.get(i));
			}else if(i % 3 == 0) {
				player1.add(poker.get(i));
			}else if(i % 3 ==1) {
				player2.add(poker.get(i));
			}else {
				player3.add(poker.get(i));
			}
		}
		
		System.out.println(player1);
		System.out.println(player2);
		System.out.println(player3);
		System.out.println(hidden);
	}

}
