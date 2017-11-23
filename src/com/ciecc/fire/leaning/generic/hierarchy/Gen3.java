package com.ciecc.fire.leaning.generic.hierarchy;

public class Gen3<T, V> extends Gen<T>{
	V ob2;
	
	public Gen3(T o, V o2) {
		super(o);
		ob2 = o2;
	}
	
	V getob2(){
		return ob2;
	}
}