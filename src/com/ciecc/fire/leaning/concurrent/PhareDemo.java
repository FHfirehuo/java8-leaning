package com.ciecc.fire.leaning.concurrent;

import java.util.concurrent.Phaser;

public class PhareDemo {

	public static void main(String[] args) {
		Phaser phsr = new Phaser(1);
		int curPhase;
		System.out.println("Starting");
		new MyThread2(phsr, "A");
		new MyThread2(phsr, "B");
		new MyThread2(phsr, "C");
		
		curPhase = phsr.getPhase();
		phsr.arriveAndAwaitAdvance();
		System.out.println("Phase " + curPhase + " Complete");
		
		curPhase = phsr.getPhase();
		phsr.arriveAndAwaitAdvance();
		System.out.println("Phase " + curPhase + " Complete");
		
		
		curPhase = phsr.getPhase();
		phsr.arriveAndAwaitAdvance();
		System.out.println("Phase " + curPhase + " Complete");
		
		phsr.arriveAndDeregister();
		
		if(phsr.isTerminated()){
			System.out.println("The Phaser is terminated");
		}else{
			System.out.println("The Phaser is not terminated");
		}
		
		curPhase = phsr.getPhase();
		System.out.println(curPhase);
		
	}
}

class MyThread2 implements Runnable {

	Phaser phsr;
	String name;
	
	
	
	public MyThread2(Phaser phsr, String name) {
		this.phsr = phsr;
		this.name = name;
		this.phsr.register();
		new Thread(this).start();
	}



	@Override
	public void run() {
		System.out.println("thread " + name + " Beginning Phase One");
		phsr.arriveAndAwaitAdvance();
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("thread " + name + " Beginning Phase Two");
		phsr.arriveAndAwaitAdvance();
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("thread " + name + " Beginning Phase Three");
		phsr.arriveAndDeregister();
		
	}
	
}
