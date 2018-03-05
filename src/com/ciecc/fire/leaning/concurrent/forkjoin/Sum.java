package com.ciecc.fire.leaning.concurrent.forkjoin;

import java.util.concurrent.RecursiveTask;

public class Sum extends RecursiveTask<Double>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	final int seqThresHold = 500;
	
	double[] data;
	
	int start, end;
	
	

	public Sum(double[] data, int start, int end) {
		this.data = data;
		this.start = start;
		this.end = end;
	}



	@Override
	protected Double compute() {
		
		double sum =0;
		if ((end - start) < seqThresHold) {
			for (int i = start; i < end; i++) {
				sum += data[i];
			}
		}else{
			int middle = (end + start) / 2;
			Sum subTaskA = new Sum(data, start, middle);
			Sum suntaskB = new Sum(data, middle, end);
			
			subTaskA.fork();
			suntaskB.fork();
			
			sum = subTaskA.join() + suntaskB.join();
		}
		
		return sum;
		
	}

	
	
}
