package com.sl.test;

public class Test7_FactorialRecursion {

	public static void main(String[] args) {
		System.out.println(fun(1000));
	}

	public static int fun(int  num) {
		if(num > 0 && num < 5) 
			return 0;
		else
			return num / 5 + fun(num / 5);
	}
	/*
	 *  5	10	15	20	25	30.....1000		1000 / 5 = 200
	 *  25	50	75	100	125...	1000		200 / 5 = 40
	 *  125	250	375	500	625	...	1000		40 / 5 = 8
	 *  5*5*5*5								8 / 5 = 1
	 */
}
