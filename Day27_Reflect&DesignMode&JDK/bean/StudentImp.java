package com.sl.bean;

public class StudentImp implements Student {

	@Override
	public void login() {
		System.out.println("valid/invalid login...");
	}

	@Override
	public void checkout() {
		System.out.println("checked out...");
	}

}
