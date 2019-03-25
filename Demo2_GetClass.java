package objectClass;

import bean.Student;

public class Demo2_GetClass {
	public static void main(String[] args) {
		Student s = new Student();
		Class clazz = s.getClass();			//get s class to clazz
		String name = clazz.getName();		//get s class's name from clazz to name
		System.out.println(name);
	}
}
