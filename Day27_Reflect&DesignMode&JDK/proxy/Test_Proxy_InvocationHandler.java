package com.sl.proxy;

import java.lang.reflect.Proxy;

import com.sl.bean.Student;
import com.sl.bean.StudentImp;

public class Test_Proxy_InvocationHandler {

	public static void main(String[] args) {
		StudentImp si =new StudentImp();
		si.login();
		si.checkout();
		
		System.out.println("---------------");
		
		MyInvocationHandler mih = new MyInvocationHandler(si);
		Student s = (Student) Proxy.newProxyInstance(si.getClass().getClassLoader(), si.getClass().getInterfaces(), mih);
		s.login();
		s.checkout();
	}

}
