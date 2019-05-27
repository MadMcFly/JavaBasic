package com.sl.list;

public class Demo4_LinkedListSimulateStack {

	public static void main(String[] args) {
		SimulatedStack ss = new SimulatedStack();
		ss.in("a");
		ss.in("b");
		ss.in("c");
		ss.in("d");
		
		while(!ss.isEmpty()) {
			System.out.println(ss.out());
		}
	}

}
