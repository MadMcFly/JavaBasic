package com.sl.list;

import java.util.LinkedList;

public class SimulatedStack {
	private LinkedList list;
	
	
	
	public SimulatedStack() {
		list = new LinkedList();		//create a LinkedList for usage
		
	}

	public void in(Object obj) {
		list.addLast(obj);
	}
	
	public Object out() {
		return list.removeLast();		//Queue use list.removeFirst()
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
}
