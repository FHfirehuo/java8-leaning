package com.ciecc.fire.leaning.thread.communication;

public class PC {

	public static void main(String[] args) {

		Q q = new Q();
		new Producer(q);
		new Consumer(q);
		System.out.println("Press Control-c to stop.");
	}

}
