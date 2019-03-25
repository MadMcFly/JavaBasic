package com.sl.otherclass;

import java.math.BigDecimal;

public class Demo5_BigDecimal {

	public static void main(String[] args) {
		System.out.println(2.0 - 1.1); 		//not accurate
		
		BigDecimal bd1 = new BigDecimal(2.0);
		BigDecimal bd2 = new BigDecimal(1.1);
		System.out.println(bd1.subtract(bd2)); 	//better, but still not right
		
		BigDecimal bd3 = new BigDecimal("2.0");
		BigDecimal bd4 = new BigDecimal("1.1");
		System.out.println(bd3.subtract(bd4)); 	//correct
		
		bd3 = BigDecimal.valueOf(2.0);
		bd4 = BigDecimal.valueOf(1.1);
		System.out.println(bd3.subtract(bd4)); 	//also correct, 
												//using String actually
	}

}
