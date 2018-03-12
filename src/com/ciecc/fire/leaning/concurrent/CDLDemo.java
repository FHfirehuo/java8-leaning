package com.ciecc.fire.leaning.concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class CDLDemo {

	public static void main(String[] args) throws InterruptedException, BrokenBarrierException {
		CyclicBarrier c = new CyclicBarrier(1);
		c.await();
		CountDownLatch cdl = new CountDownLatch(5);
		System.out.println("Starting");
		
		new MyThread(cdl);
		
		try {
			cdl.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Done");
	}
}

class MyThread implements Runnable {

	CountDownLatch latch;
	
	public MyThread(CountDownLatch latch) {
		this.latch = latch;
		new Thread(this).start();
	}



	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			latch.countDown();
		}
	}
	
}
