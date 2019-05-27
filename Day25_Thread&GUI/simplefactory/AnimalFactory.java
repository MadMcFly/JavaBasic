package com.sl.simplefactory;

public class AnimalFactory {
	public static Animal create(String name) {
		if("cat".equals(name))
			return new Cat();
		if("dog".equals(name))
			return new Dog();
		else
			return null;
	} 
}
