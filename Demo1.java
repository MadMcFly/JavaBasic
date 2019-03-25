
public class Demo1 {
	public static void main(String[] args) {
		Outer.Inner i = new Outer().new Inner();
		i.print();
		
		new Outer().print();
	}
}

class Outer {
	private int num = 10;
	class Inner {
		public void print() {
			System.out.println(num);	//inner class can call outer class member, even private
		}
	}
	
	private class Inner1 {				//private inner class, can't create obj from outside of Outer
		public void print() {
			System.out.println(num);
		}
	}
	
	public void print() {				//provide usage for outside of Outer
		Inner1 i = new Inner1();
		i.print();
	}
}