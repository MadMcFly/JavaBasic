package com.sl.bean;

public class Student {
	private String name;
	private int math;
	private int english;
	private int physics;
	private int sum;
	public Student() {
		super();
		
	}
	public Student(String name, int math, int english, int physics) {
		super();
		this.name = name;
		this.math = math;
		this.english = english;
		this.physics = physics;
		this.sum = this.math + this.english + this.physics;
	}
	public int getSum() {
		return sum;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", math=" + math + ", english=" + english + ", physics=" + physics + ", sum="
				+ sum + "]";
	}
	
}
