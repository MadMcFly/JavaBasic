package com.sl.factorymethod;

public class CatFactory implements AnimalFactory {

	@Override
	public Animal create() {
		return new Cat();
	}

}
