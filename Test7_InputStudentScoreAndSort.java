package com.sl.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

import com.sl.bean.Student;

public class Test7_InputStudentScoreAndSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				int num = o1.getSum() - o2.getSum();
				return num == 0 ? 1 : num;
			}
		});
		while(ts.size() < 5) {
			System.out.println("please type student input, in format of name,math,english,physics");
			try {
				String line = sc.nextLine();
				String[] arr = line.split(",");
				int math = Integer.parseInt(arr[1]);
				int english = Integer.parseInt(arr[2]);
				int physics = Integer.parseInt(arr[3]);
				ts.add(new Student(arr[0], math, english, physics));
			} catch (Exception e) {
				System.out.println("wrong input!");
			}
		}
		System.out.println("output of student score from low to high:");
		for (Student student : ts) {
			System.out.println(student);
		}
	}

}
