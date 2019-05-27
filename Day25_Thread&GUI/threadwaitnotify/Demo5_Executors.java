package com.sl.threadwaitnotify;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo5_Executors {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		es.submit(new MyRunnable1());
		es.submit(new MyRunnable1());

		es.shutdown();
	}

}

class MyRunnable1 implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 100; i++)
			System.out.println(Thread.currentThread().getName() +
					Thread.currentThread().getThreadGroup().getName() + "..." + i);
	}
	
}