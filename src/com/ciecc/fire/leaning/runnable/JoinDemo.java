package com.ciecc.fire.leaning.runnable;

public class JoinDemo {

	public static void main(String[] args) {
		NewJoinThread one = new NewJoinThread("one");
		NewJoinThread two = new NewJoinThread("two");
		NewJoinThread three = new NewJoinThread("three");
		
		System.out.println("Thread one is alive:" + one.t.isAlive());
		System.out.println("Thread two is alive:" + two.t.isAlive());
		System.out.println("Thread three is alive:" + three.t.isAlive());

		try {
			System.out.println("waiting for thread to finish.");
			one.t.join();
			two.t.join();
			three.t.join();
		} catch (InterruptedException e) {
			System.out.println("main Thread interrupted");
		}
		
		System.out.println("Thread one is alive:" + one.t.isAlive());
		System.out.println("Thread two is alive:" + two.t.isAlive());
		System.out.println("Thread three is alive:" + three.t.isAlive());
		System.out.println("main thread exiting.");

	}

}
