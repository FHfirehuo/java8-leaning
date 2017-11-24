package com.ciecc.fire.leaning.generic.hierarchy;

/***
 * @see Hier2Demo
 * @author fire
 *
 * @param <T>
 */
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
