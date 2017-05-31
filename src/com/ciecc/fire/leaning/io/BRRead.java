package com.ciecc.fire.leaning.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 使用bufferedreader 从控制台读取字节
 * @author fire
 *
 */
public class BRRead {

	public static void main(String[] args) throws IOException {
		char c;
		//BufferedReader(Reader in); in 是与即将创建的bufferedReader实例链接的流，read是抽象类，inputStreamReader是它的一个具体子类。该类将字节转换成字符
		
		//System.in 引用inputStream 类型对象，所以可以用作inputStream参数
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter chatacters, 'q' to quit ");
		// read characters
		
		do {
			c = (char) br.read();
			System.out.println(c);
			
		}while(c != 'q');
	}
}
