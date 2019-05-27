package com.sl.enum_using_enum;

public enum Week3 {
	MON {
		@Override
		public void show() {
			System.out.println("monday");
		}
	}, TUE {
		@Override
		public void show() {
			System.out.println("tuesday");
		}
	}, WED {
		@Override
		public void show() {
			System.out.println("wednesday");
		}
	};
	
	public abstract void show();
}
