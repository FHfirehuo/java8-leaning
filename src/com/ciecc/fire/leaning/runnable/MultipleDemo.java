package com.ciecc.fire.leaning.runnable;

public class MultipleDemo {

	public static void main(String[] args) {
		new NewMultipleThread("one");
		new NewMultipleThread("two");
		new NewMultipleThread("three");

		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("main Thread: " + i);
				Thread.sleep(10000);
			}
		} catch (InterruptedException e) {
			System.out.println("main Thread interrupted");
		}
		System.out.println("main thread exiting.");

	}

}
