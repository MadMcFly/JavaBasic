package com.sl.bean;

public class Tool<Q> {
	private Q q;

	public Q getObj() {
		return q;
	}

	public void setObj(Q q) {
		this.q = q;
	}
	
	public void show(Q q) {
		System.out.println(q);
	}
	
	public static<Q> void print(Q q) {
		System.out.println(q);
	}
}
