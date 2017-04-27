package com.ciecc.fire.leaning.synchronize;

public class Caller2 implements Runnable {

	String msg;
	Callme2 target;
	Thread t;

	public Caller2(Callme2 target2, String s) {
		target = target2;
		msg = s;
		t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		synchronized (target) {  //同步代码块
			target.call(msg);
		}

	}

}
