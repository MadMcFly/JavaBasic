package com.sl.enumeration;

public abstract class Week3 {
	private Week3() {}
	
	public static final Week3 MON = new Week3() {
		@Override
		public void show() {
			System.out.println("monday");
		}
	};
	public static final Week3 TUE = new Week3() {
		@Override
		public void show() {
			System.out.println("tuesday");
		}
	};
	public static final Week3 WED = new Week3() {
		@Override
		public void show() {
			System.out.println("wednesday");
		}
	};

	public abstract void show();
}
