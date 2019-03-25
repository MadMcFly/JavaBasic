package com.sl.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class Test3_PokerGameWithSort {

	public static void main(String[] args) {
		String[] num = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		String[] type = {" Spade "," Heart "," Plum "," Squre "};
		HashMap<Integer, String> hm = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		int index = 0;
		
		for(String s1 : num) {
			for(String s2 : type) {
				hm.put(index, s2 + s1);		//.concat();
				list.add(index);
				index++;
			}
		}
		hm.put(index, " small joker");
		list.add(index);
		index++;
		hm.put(index, " big joker");
		list.add(index);
		
		TreeSet<Integer> player1 = new TreeSet<>();
		TreeSet<Integer> player2 = new TreeSet<>();
		TreeSet<Integer> player3 = new TreeSet<>();
		TreeSet<Integer> hidden = new TreeSet<>();
		
		Collections.shuffle(list);
		for (int i = 0; i < list.size(); i++) {
			if(i >= list.size() - 3) {
				hidden.add(list.get(i));
			}else if(i % 3 == 0) {
				player1.add(list.get(i));
			}else if(i % 3 ==1) {
				player2.add(list.get(i));
			}else {
				player3.add(list.get(i));
			}
		}
		
		showCard(hm, player1, "player1");
		showCard(hm, player2, "player2");
		showCard(hm, player3, "player3");
		showCard(hm, hidden, "secret card");
	}

	public static void showCard(HashMap<Integer, String> hm, TreeSet<Integer> ts, String name) {
		System.out.println(name + " has card:");
		for(int i : ts) {
			System.out.print(hm.get(i));
		}
		System.out.println();
	}
}
