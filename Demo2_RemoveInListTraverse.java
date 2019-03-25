package com.sl.new_feature_in_JDK5;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo2_RemoveInListTraverse {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("d");
		
//		demo1(list);
//		demo2(list);
		for (String string : list) {
			if("b".equals(string)) {
				list.remove(string);		//ConcurrentModificationException
											//foreach using Iterator
			}
		}
		System.out.println(list);
	}

	private static void demo2(ArrayList<String> list) {
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			if("b" == it.next()) {
				it.remove();
			}
		}
	}

	private static void demo1(ArrayList<String> list) {
		for(int i = 0; i < list.size(); i++) {
			if("b" == list.get(i)) {
				list.remove(i--);				//index need -1 after remove
												//ArrayList use array
			}
		}
	}

}
