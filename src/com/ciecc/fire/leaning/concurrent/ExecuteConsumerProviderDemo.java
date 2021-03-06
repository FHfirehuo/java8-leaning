package com.ciecc.fire.leaning.concurrent;

/**
 * @see SynchronizedConsumerDemo
 * SynchronizedProviderDemo
 * 
 * ReentrantLockConditionDemo
 * @author fire
 *
 */
public class ExecuteConsumerProviderDemo {

	 public static void main(String[] args) {
	        Thread d1 = new Thread(new SynchronizedConsumerDemo());
	        Thread d2 = new Thread(new SynchronizedProviderDemo());
	        d1.start();
	        d2.start();
	    }
}
