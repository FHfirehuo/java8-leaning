package com.ciecc.fire.leaning.concurrent;

import java.util.LinkedList;
import java.util.List;

/**
 * 假设现在需要你设计一个单生产者，单消费者模型。 
一个线程，从缓存中读取（消费）对象。另一个线程，往缓存里写入对象。读取线程消费对象后，唤醒写入线程。若缓存中没有可读取对象，该读取线程就阻塞。写入线程写入完对象后，唤醒读取线程。若缓存超出容量大小，就阻塞写入线程。

生产者

生产者
准备写入缓存
size < max
写入对象
唤醒消费者
End
wait
yes
no
消费者

消费者
准备读取缓存
size == 0
wait
消费对象
唤醒生产者
End
yes
no
在接触AQS锁之前，我们通常会选择synchronized关键字与Object.wati，Object.notify来解决这个问题。

https://www.zybuluo.com/mikumikulch/note/268244
 * @author fire
 *
 */
//生产者(写入线程)
public class SynchronizedProviderDemo implements Runnable {

	public static List<String> cache = new LinkedList<String>();
    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                Thread.sleep(10);
                synchronized (cache) {
                    if (cache.size() < 1) {
                        System.out.println("生产bread");
                        cache.add(new String("bread"));
                        cache.notifyAll();
                    } else {
                        System.out.println("bread生产超过总量");
                        cache.wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
