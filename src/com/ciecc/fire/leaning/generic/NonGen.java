package com.ciecc.fire.leaning.generic;

// nongen is functionlly equivalent to gen but does not use generics
public class NonGen {

	Object ob;
	
	public NonGen(Object o) {
		ob = o;
	}
	
	Object getob() {
		return ob;
	}
	
	void showType() {
		System.out.println("type of ob is" + ob.getClass().getName());
	}
	
}