package com.sl.array_operation;

public class Demo1_BasicSort {

	public static void main(String[] args) {
		int[] arr = {12,65,23,84,19,67};
//		bubbleSort(arr);
		selectSort(arr);
		print(arr);
	}
	
	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j + 1]) {
					/*int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;*/
					swap(arr, j, j + 1);
				}
			}
		}
	}
	
	public static void selectSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}
		}
	}
	
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}
