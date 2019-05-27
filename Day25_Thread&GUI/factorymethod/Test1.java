package com.sl.factorymethod;

public class Test1 {

	public static void main(String[] args) {
		Cat c = (Cat) new CatFactory().create();
		c.eat();
		
		Dog d = (Dog) new DogFactory().create();
		d.eat();
	}

}
