package com.ciecc.fire.leaning.thread.deadlock;

public class A {

	synchronized void foo(B b) {
		String name = Thread.currentThread().getName();

		System.out.println(name + "extered A.foo");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		System.out.println(name + " trying to call B.last()");
		
		b.last();
	}
	
	synchronized void last(){
		System.out.println("inside A.last()");
	}
}
