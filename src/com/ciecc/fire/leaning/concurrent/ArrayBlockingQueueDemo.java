package com.ciecc.fire.leaning.concurrent;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

public class ArrayBlockingQueueDemo {

	private final static ArrayBlockingQueue<Apple> queue = new ArrayBlockingQueue<>(1);

	public static void main(String[] args) {
		new Thread(new Producer6(queue)).start();
		new Thread(new Producer6(queue)).start();
		//new Thread(new Consumer6(queue)).start();
		new Thread(new Consumer6(queue)).start();
	}
}

class Apple {
	public Apple() {
	}
}

/**
 * 生产者线程
 */
class Producer6 implements Runnable {
	private final ArrayBlockingQueue<Apple> mAbq;

	Producer6(ArrayBlockingQueue<Apple> arrayBlockingQueue) {
		this.mAbq = arrayBlockingQueue;
	}

	@Override
	public void run() {
		while (true) {
			Produce();
		}
	}

	private void Produce() {
		try {
			Apple apple = new Apple();
			mAbq.put(apple);
			System.out.println("生产:" + apple);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

/**
 * 消费者线程
 */
class Consumer6 implements Runnable {

	private ArrayBlockingQueue<Apple> mAbq;

	Consumer6(ArrayBlockingQueue<Apple> arrayBlockingQueue) {
		this.mAbq = arrayBlockingQueue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				TimeUnit.MILLISECONDS.sleep(1000);
				comsume();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void comsume() throws InterruptedException {
		Apple apple = mAbq.take();
		System.out.println("消费Apple=" + apple);
	}
}
