package com.ciecc.fire.leaning.concurrent;

import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {

	public static void main(String[] args) {
		ReentrantLock lock = new ReentrantLock();
		new LockThread(lock, "A");
		new LockThread(lock, "B");
		
	}
	
	
}

class Shared1{
	static int count = 0;
}

class LockThread implements Runnable{

	String name;
	ReentrantLock lock;
	
	public LockThread(ReentrantLock lk, String n) {
		lock = lk;
		name = n;
		new Thread(this).start();
	}
	
	
	@Override
	public void run() {
	
		System.out.println("Starting " + name);
		
		try {
			System.out.println(name + " is waiting to lock count.");
			lock.lock();
			System.out.println(name + " is locking count.");
			
			Shared1.count++;
			System.out.println(name + " : " + Shared1.count);
			System.out.println(name + " is sleeping.");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println(name + " is unlocking count.");
			lock.unlock();
		}
		
	}
	
	
	
}
