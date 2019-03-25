package com.sl.new_feature_in_JDK5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo5_AsList {

	public static void main(String[] args) {
//		demo1();
//		demo2();
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		String[] s = list.toArray(new String[10]);
		for (String string : s) {
			System.out.println(string);
		}
	}

	private static void demo2() {
		int[] arr = {1,2,3};
		List<int[]> list1 = Arrays.asList(arr);		//[[I@7852e922] arr addr
//		List<Integer> list2 = Arrays.asList(arr);	this operation is not allowed
													//int num is not a object
		Integer[] arr1 = new Integer[arr.length];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = arr[i];
		}
		List<Integer> list2 = Arrays.asList(arr1);
		list2.set(0, 11);
		System.out.println(list2);
		
		System.out.println("----------");
		System.out.println(list1);
		System.out.println(arr);
	}

	private static void demo1() {
		String[] arr = {"a", "b", "c"};
		List<String> list = Arrays.asList(arr);
//		list.add("d");							//UnsupportedOperationException
												//add, remove are not allowed!!
		System.out.println(list);
	}

}
