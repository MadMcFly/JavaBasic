package objectClass;

import bean.Student;

public class Demo4_Equals {
	public static void main(String[] args) {
		Student s1 = new Student("alice", 12);
		Student s2 = new Student("alice", 1);
		System.out.println(s1.equals(s2));		//return (s1 == s2),if their addrs are the same,is meaningless
												//override it in Student class
	}
}
