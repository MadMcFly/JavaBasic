
public class Test1_AnonymousInnerClass {
	public static void main(String[] args) {
		PersonDemo pd = new PersonDemo();
		Person p = new Person() {
			public void show() {
				System.out.println("show");
			}
		};
		pd.method(p);
		pd.method(new Person() {
			public void show() {
				System.out.println("show2");
			}
		});
	}
}

abstract class Person {
	public abstract void show();
}

class PersonDemo {
	/*Person p = new Person() {
		public void show() {
			System.out.println("show");
		}
	};*/
	public void method(Person p) {
		p.show();
	}
}