package com.ciecc.fire.leaning.io.input;

import java.io.ByteArrayInputStream;

/**
 * 这个程序首先从流中读取每个字符，并以小写形式输出。
 * 然后重置流并再次读取，这一次，在输出前会将每个字符转换成大写形式。
 * @author fire
 *
 */
public class ByteArrayInputStreamRest {

	public static void main(String[] args) {
		String tmp = "abc";
		byte b[] = tmp.getBytes();
		ByteArrayInputStream in = new ByteArrayInputStream(b);
		for (int i = 0; i < 2; i++) {
			int c;
			while ((c = in.read()) != -1) {
				if(i == 0){
					System.out.print((char)c);
				}else{
					System.out.print(Character.toUpperCase((char)c));
				}
			}
			System.out.println();
			/***
			 * ByteArrayInputStream 实现了mark()和reset()方法。
			 * 然而，如果没有调用mark()方法，那么reset（）方法会将流指针设置为流的开头
			 * ————在这种情况下，也就是设置为传递给构造函数的字节数组的开头。
			 */
			in.reset();
		}
	}
}
