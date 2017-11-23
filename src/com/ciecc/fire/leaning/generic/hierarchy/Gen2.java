package com.ciecc.fire.leaning.generic.hierarchy;

public class Gen2<T> extends Gen<T> {

	public Gen2(T o) {
		super(o);
	}

}

class Demo {
	public static void main(String[] args) {
		Gen2<Integer> num = new Gen2<Integer>(100);
		num.getob();
	}
}
