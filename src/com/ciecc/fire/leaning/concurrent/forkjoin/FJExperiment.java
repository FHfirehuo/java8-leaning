package com.ciecc.fire.leaning.concurrent.forkjoin;

import java.util.concurrent.ForkJoinPool;

public class FJExperiment {

	public static void main(String[] args) {
		int pLevel;
		int thresold;
		
		if(args.length !=2){
			System.out.println("Usage: FJExperiment parallelism threshold ");
			return;
		}
		
		pLevel = Integer.parseInt(args[0]);
		thresold = Integer.parseInt(args[1]);
		pLevel = Runtime.getRuntime().availableProcessors();
		long begint , endT;
		
		ForkJoinPool fjp = new ForkJoinPool(pLevel);
		
		double[] nums = new double[10000];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (double)i;
		}
		
		Transform task = new Transform(thresold, nums, 0, nums.length);
		
		begint = System.nanoTime();
		fjp.invoke(task);
		endT = System.nanoTime();
		
		System.out.println("Level of parallelism: " + pLevel);
		System.out.println("Sequential threshole: " + thresold);
		System.out.println("Elapsed time: " + (endT - begint) + " ns");
		
	}
}
