package com.sl.test;

public class Test7 {
	public static void main(String[] args) {
		String source = "woaiheima,heimabushibaima,bulunheimahaishibaima,zhaodaogongzuojiushihaoma,woxuanzeheima";
		String target = "ma";
		int counter = 0;
		int index = source.indexOf(target);
		
		while(index != -1) {
			counter++;
			source = source.substring(index + target.length());
			index = source.indexOf(target);
		}
		System.out.println(counter);
	}
}
