package com.ciecc.fire.leaning.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableDemo2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Sum2 s = new Sum2(2);
		FutureTask<Integer> ft = new FutureTask<>(s);
		new Thread(ft).start();
		int a = ft.get();
		System.out.println(a);
	}
}

class Sum2 implements Callable<Integer> {

	int stop;

	public Sum2(int v) {
		stop = v;
	}
	
	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for (int i = 1; i <= stop; i++) {
			sum += i;
		}
		return sum;
	}
}
