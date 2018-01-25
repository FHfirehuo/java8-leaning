package com.ciecc.fire.leaning.concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class BarDemo {

	public static void main(String[] args) {
		CyclicBarrier cb = new CyclicBarrier(3, new BarAction() );
		System.out.println("Starting");
		new MyThread1(cb, "A");
		new MyThread1(cb, "B");
		new MyThread1(cb, "C");
		new MyThread1(cb, "X");
		new MyThread1(cb, "Y");
		new MyThread1(cb, "Z");
		System.out.println("Done");
		
	}
}

class MyThread1 implements Runnable{
	CyclicBarrier cbar;
	String name;
	public MyThread1(CyclicBarrier cbar, String name) {
		this.cbar = cbar;
		this.name = name;
		new Thread(this).start();
	}
	@Override
	public void run() {

		System.out.println(name);
		
		try {
			cbar.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
		System.out.println("done:" + name);
	}
	
}

class BarAction implements Runnable{

	@Override
	public void run() {
		System.out.println("Barrier Reached");
	}
	
}
