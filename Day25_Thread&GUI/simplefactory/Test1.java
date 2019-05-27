package com.sl.simplefactory;

public class Test1 {

	public static void main(String[] args) {
		Dog d = (Dog) AnimalFactory.create("dog");
		d.eat();
		
		Cat c = (Cat) AnimalFactory.create("cat");
		c.eat();
	}

}
