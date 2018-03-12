package com.ciecc.fire.leaning.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExecutorDemo {

	private void mian() {
		//ThreadPoolExecutor a = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, milliseconds, runnableTaskQueue, threadFactory, handler);
		ExecutorService c =   Executors.newFixedThreadPool(1);
		
		ExecutorService d =   Executors.newSingleThreadExecutor();
		ExecutorService f =   Executors.newScheduledThreadPool(2);
		ExecutorService e =   Executors.newCachedThreadPool();
	}
}
