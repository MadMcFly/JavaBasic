package com.sl.enumeration;

public class Week2 {
	private String name;

	private Week2(String name) {
		super();
		this.name = name;
	}
	
	public static final Week2 MON = new Week2("monday");
	public static final Week2 TUE = new Week2("tuesday");
	public static final Week2 WED = new Week2("wednesday");

	public String getName() {
		return name;
	}
}
