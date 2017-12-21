package com.ciecc.fire.leaning.lambda;

public class LambadDemo {

	public static void main(String[] args) {
		MyNumber myNum;
		
		//lambda 表达式本质上就是一个匿名方法看.是为了实现由函数数式接口定义的另一个方法。
		//函数式接口是单抽象方法。
		myNum = () -> 123.45;
		
		System.out.println("A fixed value: " + myNum.getValue());
		myNum = () -> Math.random() * 100;
		System.out.println("A fixed value: " + myNum.getValue());
		
		//(n) -> (n%2) == 0;
	}
}
