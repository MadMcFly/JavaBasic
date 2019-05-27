
public class Demo2 {
	public static void main(String[] args) {
		Outer2.Inner2 i = new Outer2.Inner2();	//actually is outer2.new inner2(); BUT we put new at the front
		i.method();
		Outer2.Inner22.print();
	}
}

class Outer2 {
	static class Inner2 {
		public void method() {
			System.out.println("method");
		}
	}
	
	static class Inner22 {						//static method, class can directly be called by class name
		public static void print() {
			System.out.println("print");
		}
	}
}