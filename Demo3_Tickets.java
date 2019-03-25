package com.sl.synchronize;

public class Demo3_Tickets {

	public static void main(String[] args) {
		new TicketsSale().start();
		new TicketsSale().start();
		new TicketsSale().start();
		new TicketsSale().start();
	}

}

class TicketsSale extends Thread {
	private static int tic = 1000;
	private static Object obj = new Object();
	
	public void run() {								//syn method won't work...
													//use this as lock
		while(true) {
			synchronized(obj) {						//static obj or xxx.class
				if(tic <= 0)
					break;
				try {
					Thread.sleep(10);					//without syn, 0,-1...will be sold
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				System.out.println(getName() + "...ticket No." + tic--);
			}
		}
		
	}
}