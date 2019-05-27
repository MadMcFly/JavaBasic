package com.sl.generic;

public class Demo5_GenericInInterface {

	public static void main(String[] args) {
		new Demo1().show("a");
	}

}

interface Inter<T> {
	public abstract void show(T t);
}

class Demo1 implements Inter<String> {

	@Override
	public void show(String t) {
		System.out.println(t);
	}
	
}

class Demo2<T> implements Inter<T> {

	@Override
	public void show(T t) {
	}
	
}