package com.sl.synchronize;

public class Demo4_TicketsRunnable {

	public static void main(String[] args) {
		MyTickets mt = new MyTickets();
		new Thread(mt).start();
		new Thread(mt).start();
		new Thread(mt).start();
		new Thread(mt).start();							//one thread can't start() 
														//multiple times
	}

}

class MyTickets implements Runnable {
	private int tic = 100;								//static is not required
														//only one MT is created
	@Override
	public void run() {
		while(true) {
			synchronized(this) {						//this will work...
														//only one MT is created
				if(tic <= 0)
					break;
				try {
					Thread.sleep(10);					//without syn, 0,-1...will be sold
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "...ticket No." + tic--);
			}
		}
	}
	
}