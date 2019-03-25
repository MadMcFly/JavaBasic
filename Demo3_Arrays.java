package com.sl.array_operation;

import java.util.Arrays;

public class Demo3_Arrays {			//all methods in Arrays are static, so constructor is private, use class
									// name to call it's methods

	public static void main(String[] args) {
		int[] arr1 = {32, 54, 49, 16, 34, 9};
		System.out.println(Arrays.toString(arr1));
		
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.binarySearch(arr1, 12));			//key not exists, return (-insertindex -1)
		System.out.println(Arrays.binarySearch(arr1, 9));			//key exits, return one index of key
																	//(multiple keys in the array)
		System.out.println("--------------------");
		char[] arr2 = {'a', '2', 'f', '8', '1'};
		System.out.println(Arrays.toString(arr2));
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));	 				//Arrays can be used for all kinds of array
		
	}

}
