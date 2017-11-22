package com.ciecc.fire.leaning.generic.meth;

public class GenCons {

	private double val;
	
	<T extends Number> GenCons(T arg) {
		val = arg.doubleValue();
	}
	
	void show(){
		System.out.println("va;:" + val);
	}
	
	
}
