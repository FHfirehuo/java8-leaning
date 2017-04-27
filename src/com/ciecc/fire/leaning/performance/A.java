package com.ciecc.fire.leaning.performance;

public class A {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		int i = 0;
		while(System.currentTimeMillis() - start < 1001){
			i++;
		}
		System.out.println(i);
		//System.out.println(Integer.MAX_VALUE);
	}
}
