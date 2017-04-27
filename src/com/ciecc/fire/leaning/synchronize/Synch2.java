package com.ciecc.fire.leaning.synchronize;

public class Synch2 {

	public static void main(String[] args) {

		Callme2 target = new Callme2();
		Caller2 ob1 = new Caller2(target, "Hello");
		Caller2 ob2 = new Caller2(target, "synchronized");
		Caller2 ob3 = new Caller2(target, "world");

		try {
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		} catch (InterruptedException e) {

		}
	}

}
