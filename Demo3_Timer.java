package com.sl.thread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Demo3_Timer {

	public static void main(String[] args) throws InterruptedException {
		Timer t = new Timer();
		Date d = new Date(119, 2, 14, 18, 18, 40);
		t.schedule(new MyTimerTask(), d, 3000);
		
		while(true) {
			Thread.sleep(1000);
			System.out.println(new Date().toString());
		}
	}

}

class MyTimerTask extends TimerTask {

	@Override
	public void run() {
		System.out.println("time to wake up and study!");
	}
	
}