package com.ciecc.fire.leaning.lambda;

public class BlocklambdaDemo {

	public static void main(String[] args) {
		NumericFunc factorial = (n) -> {
			int result = 1;
			for(int i=1; i<=n; i++){
				result = i * result;
			}
			//在块lambda中必须显式的使用return语句来返回值。必须这么做，因为块lamdba体代表的不是单独的一个表达式。
			return result;
		};//此处的分号是必须的
		
		System.out.println("The factoral of 3 is " + factorial.func(3));
		System.out.println("The factoral of 5 is " + factorial.func(5));
	}
}
