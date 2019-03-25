package com.sl.new_feature_in_JDK5;

import static java.util.Arrays.sort;		//static improt
import static java.util.Arrays.toString;

public class Demo3_StaticImport {

	public static void main(String[] args) {
		int[] arr = {11, 33, 22, 55, 44};
		sort(arr);
//		System.out.println(toString(arr));	
										//conflict with toString() in Object
	}

}
