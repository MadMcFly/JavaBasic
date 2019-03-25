package objectClass;

import bean.Student;

public class Demo1_HashCode {

	public static void main(String[] args) {
		Object o = new Object();
		System.out.println(o.hashCode());
		
		Student s1 = new Student("alice",12);
		Student s2 = new Student();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
