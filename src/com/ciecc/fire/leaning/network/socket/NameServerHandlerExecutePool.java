package com.ciecc.fire.leaning.network.socket;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

//http://blog.csdn.net/qq513036862/article/details/53583508
public class NameServerHandlerExecutePool {

	private ExecutorService executor;

	public NameServerHandlerExecutePool(int maxPoolSize, int queueSize) {
		executor = new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(), maxPoolSize, 120L,
				TimeUnit.SECONDS, new ArrayBlockingQueue(queueSize));
	}

	public void execute(Runnable task) {
		executor.execute(task);
	}
}
