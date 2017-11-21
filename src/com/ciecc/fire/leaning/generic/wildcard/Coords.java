package com.ciecc.fire.leaning.generic.wildcard;

// this class holds an array of coordinate objects
//这个类包含一个坐标对象的数组
public class Coords<T extends TwoD> {

	T[] coords;
	
	public Coords(T[] o) {
		coords = o;
	}
}
