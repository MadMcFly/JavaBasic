package com.sl.reflect;

import java.lang.reflect.Field;

import com.sl.bean.Person;

public class Demo4_Field {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Person p = new Person(12, "alice");
		Class clazz = p.getClass();
//		Field f = clazz.getField("age");
		
		Field f = clazz.getDeclaredField("age");
		f.setAccessible(true);
		f.set(p, 13);
		
		System.out.println(f);
		System.out.println(f.get(p));				//get obj p in field f	
		System.out.println(p);						//set obj p in field f
	}

}
