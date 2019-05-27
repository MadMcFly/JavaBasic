package com.sl.enum_using_enum;

public enum Week2 {
	MON("monday", 24), TUE("tuesday", 24), WED("wednesday", 24);
	
	private String name;
	private int hour;
	private Week2(String name, int hour) {
		this.name = name;
		this.hour = hour;
	}
	public String getName() {
		return name;
	}
	
	public String toString() {
		return name;
	}
}
