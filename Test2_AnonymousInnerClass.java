
public class Test2_AnonymousInnerClass {
	public static void main(String[] args) {
		OuterTest2.method().show();
		//output is "HelloWorld"
		//finish this program	
	}
}

interface InterTest2 {
	void show();
}

class OuterTest2 {
	//my content
	public static InterTest2 method() {
		return new InterTest2() {
			public void show() {
				System.out.println("HelloWorld");
			}
		};
	}
}