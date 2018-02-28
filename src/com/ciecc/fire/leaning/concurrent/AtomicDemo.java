package com.ciecc.fire.leaning.concurrent;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo {

	public static void main(String[] args) {
		new AtomThread("A");
		new AtomThread("B");
		new AtomThread("C");
	}
	
	
}

class Shared2 {
	static AtomicInteger ai = new AtomicInteger(0);
	
}

class AtomThread implements Runnable{

	String name;
	
	
	
	public AtomThread(String name) {
		this.name = name;
		new Thread(this).start();
	}

	@Override
	public void run() {
		System.out.println("starting " + name);
		
		for (int i = 1; i <= 4; i++) {
			//System.out.println(name + " got: " + Shared2.ai.getAndSet(i));
			//System.out.println(name + " got: " + Shared2.ai.getAndIncrement());
			
		}
	}
	
}