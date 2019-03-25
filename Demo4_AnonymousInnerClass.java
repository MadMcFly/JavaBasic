
public class Demo4_AnonymousInnerClass {
	public static void main(String[] args) {
		new Outer5().method();
	}
}

interface Inter {
	public abstract void print();
}

class Outer5 {
	public void method() {
		new Inter() {						//son class's object of interface Inter
			public void print() {
				System.out.println("print");
			}
		}.print();
	}	
}