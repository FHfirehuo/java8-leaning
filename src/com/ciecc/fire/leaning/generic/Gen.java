package com.ciecc.fire.leaning.generic;

public class Gen<T> {

	T ob; //declare an object of type T
	
	//传递构造函数对T类型对象的引用
	//pass the constructor a reference to an object of type T
	Gen(T o) {
		ob = o;
	}
	
	T getob() {
		
		return ob;
	}
	void showTpye() {
		System.out.println("Type of is " + ob.getClass().getName());
	}
}
