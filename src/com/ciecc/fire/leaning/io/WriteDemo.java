package com.ciecc.fire.leaning.io;

public class WriteDemo {
	public static void main(String[] args) {
		
		//System.out 是字节流输出
		
		int b;
		
		b = 'A';
		System.out.write(b); //该方法输出有byteval指定的字节。尽管byteval被声明为整数，但是只有低8位被输出。
		System.out.write('\n');
		// 通常不会使用write（）执行控制台输出（尽管在某些情况下这么做是有用的），因为print（）和println（）确实更容易使用。
		
		//print和println是由PrintStream类定义的
	}
}
