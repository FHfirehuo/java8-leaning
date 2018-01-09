package com.ciecc.fire.leaning.lambda.method;


// a class that stores the temperature high for a day
//
public class HighTemp {

	private int hTemp;
	
	public HighTemp(int ht) {
		hTemp = ht;
	}
	
	
	//return true if the invoking HighTemp object has the same temperature as ht2
	//如果调用的HighTemp对象具有与ht2相同的温度，则返回true
	boolean sameTemp(HighTemp ht2){
		return hTemp == ht2.hTemp;
	}
	
	boolean lessThanTemp(HighTemp ht2){
		return hTemp < ht2.hTemp;
	}
	
}
