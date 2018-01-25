package com.ciecc.fire.leaning.concurrent;

import java.util.concurrent.Semaphore;

public class SemDemo {

	public static void main(String[] args) {
		Semaphore sem = new Semaphore(1);
		new IncThread("A", sem);
		new DecThread("B", sem);
	}

}

// a shared resource
class Shared {
	static int count = 0;
}

class IncThread implements Runnable {

	String name;
	Semaphore sem;
	
	
	
	public IncThread(String name, Semaphore sem) {
		super();
		this.name = name;
		this.sem = sem;
		new Thread(this).start();
	}

	@Override
	public void run() {
		System.out.println("Starting " + name);
		try{
			//First, get a permit
			System.out.println(name + " is waiting for a permit");
			sem.acquire();
			System.out.println(name + " gets a permit");
			for (int i = 0; i < 5; i++) {
				Shared.count ++;
				System.out.println(name + ": " + Shared.count);
				
				//Now, allow a context switch -- if possible
				Thread.sleep(10);
			}
		} catch (InterruptedException exc) {
			System.out.println(exc);
		}
		
		System.out.println(name + " relsases the permit.");
		sem.release();
	}
}

class DecThread implements Runnable {
	
	String name;
	Semaphore sem;
	
	
	

	public DecThread(String name, Semaphore sem) {
		super();
		this.name = name;
		this.sem = sem;
		new Thread(this).start();
	}

	@Override
	public void run() {
		System.out.println("Starting " + name);
		try{
			//First, get a permit
			System.out.println(name + " is waiting for a permit");
			sem.acquire();
			System.out.println(name + " gets a permit");
			for (int i = 0; i < 5; i++) {
				Shared.count --;
				System.out.println(name + ": " + Shared.count);
				
				//Now, allow a context switch -- if possible
				Thread.sleep(10);
			}
		} catch (InterruptedException exc) {
			System.out.println(exc);
		}
		
		System.out.println(name + " relsases the permit.");
		sem.release();
	}
	
}