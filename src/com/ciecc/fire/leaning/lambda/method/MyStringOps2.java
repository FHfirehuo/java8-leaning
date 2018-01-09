package com.ciecc.fire.leaning.lambda.method;

/**
 * 实例方法的方法引用
 * @author fire
 *
 */
public class MyStringOps2 {

	String strReverse(String str){
		String result = "";
		int i;
		
		for (i = str.length()-1; i >=0; i--) {
			result += str.charAt(i);
		}
		
		return result;
	}
}
