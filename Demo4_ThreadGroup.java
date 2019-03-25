package com.sl.threadwaitnotify;

public class Demo4_ThreadGroup {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRunnable());
		System.out.println(t1.getThreadGroup().getName());
		
		ThreadGroup tg = new ThreadGroup("new group");
		Thread t2 = new Thread(tg, new MyRunnable(), "tttt2222");
		System.out.println(t2.getName() + "...." + t2.getThreadGroup().getName());
	}

}

class MyRunnable implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 100; i++)
			System.out.println(Thread.currentThread().getName() +
					Thread.currentThread().getThreadGroup().getName() + "..." + i);
	}
	
}