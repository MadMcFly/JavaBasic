package com.sl.new_feature_in_JDK5;

public class Demo4_ChangeableArgs {

	public static void main(String[] args) {
		int[] arr = {11, 22, 33, 44 ,55};
//		print(arr);
		print(11,22,33,44);
	}
	
	public static void print(int x, int ... arr) {	//changeable args at tail
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	/*public static void show(char ... cs, int ... arr) {	//no more than 1
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}*/
}
