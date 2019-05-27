package com.sl.template;

public class Demo1_Template {

	public static void main(String[] args) {
		System.out.println(new Demo().getTime());
	}

}

abstract class Template {
	public final long getTime() {
		long start = System.currentTimeMillis();
		function();
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	public abstract void function();
}

class Demo extends Template {
	@Override
	public void function() {
		for(int i = 0; i < 10000; i++) {
			System.out.println(i);
		}
	}
}