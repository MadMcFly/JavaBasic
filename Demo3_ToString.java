package objectClass;

import bean.Student;

public class Demo3_ToString {

	public static void main(String[] args) {
		Student s = new Student("alice", 12);
		/*bean.Student@7852e922			class name + @ + hashCode() in HexString
		bean.Student@7852e922			getClass().getName() + '@' + Integer.toHexString(hashCode())*/

		System.out.println(s.toString());
		System.out.println(s);
		
	}
	//in Student class, override toString(), using alt + shift + s, then s
	/*@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}*/
	
}
