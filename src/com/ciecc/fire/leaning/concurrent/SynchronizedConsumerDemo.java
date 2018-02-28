package com.ciecc.fire.leaning.concurrent;

//消费者(读取线程)
public class SynchronizedConsumerDemo implements Runnable {

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                Thread.sleep(10);
                synchronized (SynchronizedProviderDemo.cache) {
                    if (SynchronizedProviderDemo.cache.size() == 0) {
                        System.out.println("bread全部消费完毕");
                        SynchronizedProviderDemo.cache.wait();
                    } else {
                        System.out.println("消费bread");
                        SynchronizedProviderDemo.cache.get(0);
                        SynchronizedProviderDemo.cache.remove(0);
                        SynchronizedProviderDemo.cache.notifyAll();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
