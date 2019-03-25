package com.sl.chario;

public class Demo6_Wrap {

	public static void main(String[] args) {
		GoodStudent gs = new GoodStudent(new Student());
		gs.code();
	}

}

interface Coder {
	public void code();
}

class Student implements Coder {

	@Override
	public void code() {
		System.out.println("java");
	}
	
}

class GoodStudent implements Coder {
	
	private Student s;					//get wrapped class
	public GoodStudent(Student s) {		//take wrapped object as input
		this.s = s;
	}
	@Override
	public void code() {
		s.code();
		System.out.println("MySQL");
		System.out.println("XML");
		System.out.println("...");
	}
	
}