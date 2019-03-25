package com.sl.test;

import java.util.Arrays;

public class Test1_SortIntInString {

	public static void main(String[] args) {
		String s = "12 64 89 12 57 53";
		String[] sArr = s.split(" ");
		
		int[] arr = new int[sArr.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(sArr[i]);
		}
		
		Arrays.sort(arr);
		StringBuffer sb = new StringBuffer();		//StringBuilder
		for (int i = 0; i < arr.length; i++) {
			if(i == arr.length - 1) {
				sb.append(arr[i]);
			}else {
				sb.append(arr[i] + " ");
			}
		}
		
		System.out.println(sb); 					//call toString() default
	}

}
