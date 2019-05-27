package com.sl.threadwaitnotify;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo6_Callable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(2);
		Future<Integer> f1 = es.submit(new MyCallable(10));
		Future<Integer> f2 = es.submit(new MyCallable(1));
		System.out.println(f1.get());
		System.out.println(f2.get());
	}

}

class MyCallable implements Callable<Integer> {
	private int num;
	
	
	public MyCallable(int num) {
		super();
		this.num = num;
	}


	@Override
	public Integer call() throws Exception {
		
		return num;
	}
	
}