package com.sl.generic;

import com.sl.bean.Student;
import com.sl.bean.Tool;
import com.sl.bean.Worker;

public class Demo3_CastException {

	public static void main(String[] args) {
		/*Tool t = new Tool();
		t.setObj(new Student("alice", 12));
		Worker w = (Worker) t.getObj();
		//class Tool without generic
		//ClassCastException: 
		//com.sl.bean.Student cannot be cast to com.sl.bean.Worker*/
	
		Tool<Student> t = new Tool<>();
		t.setObj(new Student("alice", 12));
//		Worker w = (Worker) t.getObj();
		//with generic <Student>, runtime error appears in compiling
	}

}
