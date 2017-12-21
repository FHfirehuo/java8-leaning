package com.ciecc.fire.leaning.lambda;

public class GenericFunctionalInterfaceDemo {

	public static void main(String[] args) {
		SomeFunc<String> reverse = (str) -> {
			String result = "";
			int i;
			for (i = str.length()-1; i >= 0; i--) {
				result += str.charAt(i);
			}
			return result;
		};
		
		System.out.println(reverse.func("lambda"));
		
		SomeFunc<Integer> factorial = (n) -> {
			int result = 1;
			for (int i = 1; i < n; i++) {
				result += i * result;
			}
			return result;
		};
		
		System.out.println(factorial.func(3));
	}
	
	
}
