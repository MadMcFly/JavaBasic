
public class Test1 {
	public static void main(String[] args) {
		Outer3.Inner3 i = new Outer3().new Inner3();
		i.print();
	}
}

class Outer3 {
	int num = 10;
	class Inner3 {
		int num = 20;
		public void print() {
			int num = 30;
			System.out.println(num);
			System.out.println(this.num);
			System.out.println(Outer3.this.num);		//Outer3 to call this, then "this" represents Outer3
		}
	}
}