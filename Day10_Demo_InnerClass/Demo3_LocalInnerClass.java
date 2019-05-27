
public class Demo3_LocalInnerClass {
	public static void main(String[] args) {
		new Outer4().method();
	}
}

class Outer4 {
	public void method() {
		final int num = 10;				//in jdk1.8 don't need "final"
		class Inner4 {
			public void print() {
				System.out.println(num);
			}
		}
		
		Inner4 i = new Inner4();
		i.print();
	}
}