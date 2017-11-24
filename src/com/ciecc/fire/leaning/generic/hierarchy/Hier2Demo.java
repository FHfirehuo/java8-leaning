package com.ciecc.fire.leaning.generic.hierarchy;

public class Hier2Demo {

	public static void main(String[] args) {

		Gen4<String> w = new Gen4<String>("Hello", 47);
		System.out.print(w.getob() + " ");
		System.out.println(w.getnum());
	}

}
