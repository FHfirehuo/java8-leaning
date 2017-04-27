package com.ciecc.fire.leaning.thread;

public class NewThread extends Thread {

	public NewThread() {
		super("Demo Thread");
		System.out.println("child thread:" + this);
		start();
	}

	@Override
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child Thread: " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Child interrupted");
		}

		System.out.println("exiting Child thread.");
	}
}
