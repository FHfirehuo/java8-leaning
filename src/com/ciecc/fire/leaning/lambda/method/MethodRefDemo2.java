package com.ciecc.fire.leaning.lambda.method;

import com.ciecc.fire.leaning.lambda.StringFunc;

public class MethodRefDemo2 {
	
	static String stringOp(StringFunc sf, String s){
		return sf.func(s);
	}

	public static void main(String[] args) {
		String inStr = "lambda add power to Java";
		
		String outStr;
		
		MyStringOps2 strOps = new MyStringOps2();
		
		outStr = stringOp(strOps :: strReverse, inStr);
		//outStr = stringOp(MyStringOps2 :: strReverse, inStr);
		System.out.println("Original string: " + inStr);
		System.out.println("String reversed: " + outStr);
		
	}
}
