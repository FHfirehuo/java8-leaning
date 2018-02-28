package com.ciecc.fire.leaning.concurrent;

/**
 * https://www.zybuluo.com/mikumikulch/note/268244
 * 
 * 通过Condition与Lock结合运用写出来的代码，相对notifyAll()来说更加易读。阻塞，唤醒，同步读写的过程，体现的更加清楚了。

总结
Condition与ReentrantLock搭配起来，能够实现比Synchronized关键字与Object.wait/notify的组合更精确地对线程的控制。 
Object.wait/notify是以“锁”为单位对线程进行阻塞唤醒，而Condition则是以“线程”为单位，对线程进行阻塞与唤醒的。所以Condition能够唤醒某个特定的阻塞线程。而Object.notify则不可以。
 * @author fire
 *
 */
public class ExecuteReentrantLockConditionDemo {

	 public static void main(String[] args) {
	        final ReentrantLockConditionDemo rd = new ReentrantLockConditionDemo();
	        // 创建1个消费者线程
	        for (int i = 0; i < 1; i++) {
	            new Thread(new Runnable() {
	                public void run() {
	                    try {
	                        rd.get();
	                    } catch (InterruptedException e) {
	                        e.printStackTrace();
	                    }
	                }
	            }).start();
	        }
	        // 创建10个生产者线程
	        for (int i = 0; i < 10; i++) {
	            new Thread(new Runnable() {
	                public void run() {
	                    try {
	                        rd.put("bread");
	                    } catch (InterruptedException e) {
	                        e.printStackTrace();
	                    }
	                }
	            }).start();
	        }
	    }
}
