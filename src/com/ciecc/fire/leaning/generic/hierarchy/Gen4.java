package com.ciecc.fire.leaning.generic.hierarchy;

public class Gen4<T> extends NonGen{

	T ob;
	public Gen4(T o, int i) {
		super(i);
		ob = o;
	}
	
	T getob(){
		return ob;
	}
}
