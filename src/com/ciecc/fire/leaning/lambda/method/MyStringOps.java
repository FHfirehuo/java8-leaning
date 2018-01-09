package com.ciecc.fire.leaning.lambda.method;


/**
 * 静态方法的方法引用
 * @author fire
 * this class defines a static method called strRecerse()
 */
public class MyStringOps {

	//
	static String strReverse(String str){
		String result = "";
		int i;
		
		for (i = str.length()-1; i >=0; i--) {
			result += str.charAt(i);
		}
		
		return result;
	}
	
}
