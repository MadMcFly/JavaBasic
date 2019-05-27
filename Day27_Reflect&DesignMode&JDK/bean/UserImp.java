package com.sl.bean;

public class UserImp implements User {

	@Override
	public void add() {
		System.out.println("you are added/not added...");
	}

	@Override
	public void remove() {
		System.out.println("you are removed/not...");
	}

}
