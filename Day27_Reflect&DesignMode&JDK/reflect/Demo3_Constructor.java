package com.sl.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.sl.bean.Person;

public class Demo3_Constructor {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class clazz = Class.forName("com.sl.bean.Person");
		Constructor<Person>[] arr = clazz.getConstructors();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		Constructor c = clazz.getConstructor(int.class, String.class);
		Person p = (Person) c.newInstance(12, "alice");
		System.out.println(p);
	}

}
