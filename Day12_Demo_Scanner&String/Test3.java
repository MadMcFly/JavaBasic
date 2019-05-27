package com.sl.test;

public class Test3 {

	public static void main(String[] args) {
		String s = "ABCDEFabcde1234567)(*&^%%$";
		int counterUpper = 0;
		int counterLower = 0;
		int counterNum = 0;
		int counterOther = 0;
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c >= 'A' && c <= 'Z') {
				counterUpper++;
			}else if(c >= 'a' && c <= 'z') {
				counterLower++;
			}else if(c >= '0' && c <= '9') {
				counterNum++;
			}else {
				counterOther++;
			}
		}
		
		System.out.println(s + " has " + counterUpper + " uppercase letters, " + counterLower + 
				" lowercase letters, " + counterNum + " numbers, " + counterOther + " others");
	}

}
