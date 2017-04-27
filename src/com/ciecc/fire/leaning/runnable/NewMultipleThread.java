package com.ciecc.fire.leaning.runnable;

class NewMultipleThread implements Runnable {

	Thread t;
	String name;

	public NewMultipleThread(String threadName) {
		name = threadName;
		t = new Thread(this, name);
		System.out.println("new Thread: " + t);
		t.start();
	}

	@Override
	public void run() {

		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(name + " : " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println(name + " interrupted");
		}

		System.out.println(name + " exiting .");
	}

}
