package com.sl.test;

import java.lang.reflect.Field;

public class Tool {

	public static void setProperty(Object target, String name, Object value) throws Exception {
		Class clazz = target.getClass();
		Field f = clazz.getDeclaredField(name);
		f.setAccessible(true);
		f.set(target, value);
	}
}
