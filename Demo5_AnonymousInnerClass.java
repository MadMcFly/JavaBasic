
public class Demo5_AnonymousInnerClass {
	public static void main(String[] args) {
		new Outer6().method();
	} 
}

interface Inter6 {
	public abstract void show1();
	public abstract void show2();
}

class Outer6 {
	public void method() {
		Inter6 i = new Inter6() {
			public void show1() {
				System.out.println("show1");
			}
			public void show2() {
				System.out.println("show2");
			}
		};
		i.show1();
		i.show2();
	}
}