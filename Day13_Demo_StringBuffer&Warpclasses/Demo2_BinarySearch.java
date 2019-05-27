package com.sl.array_operation;

public class Demo2_BinarySearch {

	public static void main(String[] args) {
		int[] arr = {11,23,45,65,87,154};
		System.out.println(binarySearch(arr, 15));
	}
	
	public static int binarySearch(int[] arr, int target) {
		int i = 0, j = arr.length -1, mid = (i + j) / 2;
		while(arr[mid] != target) {
			if(arr[mid] < target) {
				i = mid + 1;
			}else {
				j = mid - 1;
			}
			
			if(i > j) return -1;
			mid = (i + j) / 2;
		}
		return mid;
	}

}
