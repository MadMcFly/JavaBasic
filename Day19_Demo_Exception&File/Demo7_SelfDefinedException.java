package com.sl.exception;

public class Demo7_SelfDefinedException {

	public static void main(String[] args) throws Exception {
		Person_7 p = new Person_7();
		p.setAge(-10);
	}

}

class Person_7{
	private String name;
	private int age;
	public Person_7() {
		super();
		
	}
	public Person_7(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws PersonAgeOutOfBoundsException /*throws Exception*/ {
		if(age < 0 || age > 150) {
			throw new PersonAgeOutOfBoundsException("person age is not valid");
		}
		this.age = age;
	}
}

class PersonAgeOutOfBoundsException extends Exception {

	public PersonAgeOutOfBoundsException() {
		super();
		
	}

	public PersonAgeOutOfBoundsException(String message) {
		super(message);
		
	}
	
}