package com.sl.warpclass;

public class Demo2_TransferWithString {

	public static void main(String[] args) {
		//int to String
		int i = 100;
		String s1 = i + "";				//recommended
		System.out.println(s1);
		
		String s2 = String.valueOf(i);	//recommended
		System.out.println(s2);
		
		String s3 = new Integer(i).toString();
		System.out.println(s3);
		
		String s4 = Integer.toString(i);
		System.out.println(s4);
		
		System.out.println("------------------");
		//String to int
		String s = "100";
		int i2 = new Integer(s).intValue();
		System.out.println(i2);
		
		int i3 = Integer.parseInt(s);	//recommended
		System.out.println(i3);
	}

}
