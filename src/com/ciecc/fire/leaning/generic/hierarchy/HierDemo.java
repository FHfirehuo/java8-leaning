package com.ciecc.fire.leaning.generic.hierarchy;

public class HierDemo {
	public static void main(String[] args) {
		Gen3<String, Integer> x = new Gen3<String, Integer>("value is:", 99);
		System.out.println(x.getob());
		System.out.println(x.getob2());
	}
}
