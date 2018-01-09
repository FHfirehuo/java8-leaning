package com.ciecc.fire.leaning.lambda.method;

/**
 * @see GenericMethodRefDemo
 * @author fire
 *
 */
public class MyArrayOps {

	static <T> int countMatching(T[] vals, T v){
		int count = 0;
		
		for(int i=0; i < vals.length; i++){
			if(vals[i] ==v){
				count ++;
			}
		}
		
		return count;
	}
}
