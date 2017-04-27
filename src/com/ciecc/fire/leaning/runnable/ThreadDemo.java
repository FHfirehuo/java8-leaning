package com.ciecc.fire.leaning.runnable;

public class ThreadDemo {

	public static void main(String[] args) {
		new NewThread();

		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("main Thread: " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("main Thread interrupted");
		}
		System.out.println("main thread exiting.");

	}

}
