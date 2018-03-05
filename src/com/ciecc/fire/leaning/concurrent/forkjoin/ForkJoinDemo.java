package com.ciecc.fire.leaning.concurrent.forkjoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;



public class ForkJoinDemo {
	
	public static void main(String[] args) {
		//ForkJoinPool fjp = new ForkJoinPool();
		//1由于存在公共池因此不必显示的构建一个ForkJoinPool
		//ForkJoinPool fjp = ForkJoinPool.commonPool();
		double[] nums = new double[100000];
		System.out.println("nums.length:" +nums.length);
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (double) i;
		}
		
		System.out.println("A portion of the original sequence:");
		
		for (int i = 0; i < 10; i++) {
			System.out.print(nums[i] + " " );
		}
		
		System.out.println("\n");
		
		SqrtTransform task = new SqrtTransform(nums, 0, nums.length);
		
		//2不需要显示获得对公共池的引用，因此对不在池中的任务调用forkjointask的invoke或fork方法将自动使任务在公共池中执行。所以可以删除fjp变量
		//fjp.invoke(task);
		task.invoke();
		
		System.out.println("A portion of the transformed sequence" + "( to four decimal places):");
		
		for (int i = 0; i < 10; i++) {
			System.out.format("%.4f ", nums[i]);
		}
		
		System.out.println();
	}
}

class SqrtTransform extends RecursiveAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	final int seqThresdhold = 1000;
	
	double[] data;
	
	int start, end;

	SqrtTransform(double[] data, int start, int end) {
		this.data = data;
		this.start = start;
		this.end = end;
	}

	protected void compute(){
		if ((end -start) < seqThresdhold ) {
			
			for (int i = start; i < end; i++) {
				data[i] = Math.sqrt(data[i]);
			}
		}else {
			System.out.println("start:" +start + " end:" +end);
			int middle = (start + end) / 2 ;
			
			invokeAll(new SqrtTransform(data, start, middle),
					new SqrtTransform(data, middle, end));
			
		}
	}
	
}