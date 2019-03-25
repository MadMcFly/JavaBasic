package com.sl.exception;

public class Demo3_TryMulitpleCatch {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int[] arr = {1,2,3,4};
		try {
			System.out.println(a / b);
			arr = null;
			System.out.println(arr[10]);
		} /*catch (ArithmeticException e) {
			System.out.println("can't be devided by 0.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array index out of bound");
		} catch (Exception e) {
			System.out.println("some exception...");
		}*/ catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("some exception...arithmetic or array");
		}
		System.out.println(arr[0]);
	}

}
