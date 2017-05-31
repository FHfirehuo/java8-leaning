package com.ciecc.fire.leaning.io;

import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out, true);
		
		pw.println("This is a string");
		
		int i = -7;
		pw.println(i);
		double d = 4.5e-7;
		pw.println(d);
		//尽管使用System.out向控制台输出是可以接受的，但是最好将其用调试或用户示例程序。
		//对于实际程序，使用java向控制台输出的推荐方法是通过PrintWriter流。
		
		//PrintWriter是基于字符的类之一。
	}
}
