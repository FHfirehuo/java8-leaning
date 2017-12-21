package com.ciecc.fire.leaning.lambda;

/**
 * 作为参数传递lambda
 * @author fire
 * use lambda expressions as an argument to a method
 */
public class LambdasAsArgumentsDemo {

	//this method has a functional interface the type of
	//its first paramenter. Thus, it can be passed a reference to 
	// any instance of that interface, including the instance created
    // by a lambda experession.
	//这个方法有一个功能接口，它的第一个参数的类型。 因此，它可以传递一个对该接口的任何实例的引用，包括由lambda表达式创建的实例。
	static String stringOp(StringFunc sf, String s){
		return sf.func(s);
	}
	
	public static void main(String[] args) {
		String inStr = "lamdba add power to Java";
		String outStr;
		
		System.out.println("Here is input string : " + inStr);
		
		// here, a simple expression lambda that uppercase a string is passed to stringOp()
		outStr = stringOp( (str) -> str.toUpperCase(), inStr );
		System.out.println(" The string in uppercase: " + outStr);
		
		//this passes a block lambda that remove spaces
		outStr = stringOp(str -> {
			String result = "";
			int i;
			
			for (i = 0;  i < str.length(); i++) {
				if(str.charAt(i) != ' ')
					result += str.charAt(i);
			}
			return result;
			
		}, inStr);
		
		System.out.println("The string with spaces removed: " + outStr);
		
		
		//of course, it is also possible to pass a tringfunc instance created by an earlier lambda expression.
		// for example, after this declation executes, reverse refers to an instance of stringfunc
		StringFunc reverse = str -> {
			String result = "";
			int i;
			for (i= str.length()-1; i>=0; i--) {
				result += str.charAt(i);
			}
			return result;
		};
		
		//now , re
		System.out.println("The String reversed: " + stringOp(reverse, inStr));
		
	}


}
