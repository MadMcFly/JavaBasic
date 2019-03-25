package com.sl.Test;

public class Test1 {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		System.out.println(array2String(arr));
	}
	
	public static String array2String(int[] arr) {
		StringBuffer sb = new StringBuffer("{");
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length - 1) {
				sb.append(arr[i]).append("}");
			}else {
				sb.append(arr[i]).append(", ");
			}
		}
		return sb.toString();
	}
}
