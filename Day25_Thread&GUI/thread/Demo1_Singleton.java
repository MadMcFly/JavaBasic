package com.sl.thread;

public class Demo1_Singleton {

	public static void main(String[] args) {
//		Singleton s1 = new Demo1_Singleton();
		
		/*Singleton s1 = Singleton.s;
		Singleton.s = null;
		Singleton s2 = Singleton.s;
		System.out.println((s1 == s2));*/
		
		Singleton s1 = Singleton.get();
		Singleton s2 = Singleton.get();
		System.out.println((s1 == s2));
		
		Singleton s3 = Singleton.sf;
		Singleton s4 = Singleton.sf;
		System.out.println((s1 == s2));
	}

}

class Singleton {
	private Singleton() {}
	
	/*private static Singleton s = new Singleton();
	
	public static Singleton get() {
		return s;
	}*/
	public static final Singleton sf = new Singleton();
	
	private static Singleton s = null;
	
	public static synchronized Singleton get() {
		if(s == null)
			s = new Singleton();
		return s;
	}
} 