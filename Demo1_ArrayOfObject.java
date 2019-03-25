package com.sl.collection;

import com.sl.bean.Student;

public class Demo1_ArrayOfObject {

	public static void main(String[] args) {
		Student[] arr = new Student[5];
		arr[0] = new Student("alice", 12);
		arr[1] = new Student("bob", 13);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]); 		//override toString()
		}
	}

}
