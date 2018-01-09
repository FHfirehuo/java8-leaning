package com.ciecc.fire.leaning.lambda.method;

import com.ciecc.fire.leaning.lambda.StringFunc;
/**
 * 静态方法的方法引用
 * 对比可看实例方法的方法引用和作为参数传递的lambda表达式
 * @author fire
 *
 */
public class MethodRefDemo {

	//this method has a functionl interface as the type of its first parameter.
	// thus, it can be passed any instance of that interface, including a method reference
	//这个方法有一个功能接口作为其第一个参数的类型。 因此，它可以通过该接口的任何实例，包括一个方法引用
	static String stringOp(StringFunc sf, String s){
		return sf.func(s);
	}
	
	public static void main(String[] args) {

		String inStr = "lambda add power to Java";
		String outStr;
		
		// 这里, 将对mystringops 内声明的静态方法strReverse（）的引用传递给了StingOp方法的第一个参数。
		//可以这么做，因为stsReverse与stringfunc函数式接口兼容。
		//因此，表达式MystringOps::strreverse的计算结果为对象引用，其中strreverse提供了Stringfunc的func（）方法的实现。
		outStr = stringOp(MyStringOps :: strReverse, inStr);
		System.out.println("Original string: " + inStr);
		System.out.println("String reversed: " + outStr);
	}

}
