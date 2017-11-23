package com.ciecc.fire.leaning.io.file;

import java.io.ByteArrayInputStream;

/***
 * close()方法对ByteArrayInputStream对象没有效果。
 * 所以，不需要为ByteArrayInputStream对象调用close()方法。
 * 但是如果这么做的话，也不会产生错误。
 * @author fire
 *
 */
public class ByteArrayInputStreamDemo {

	public static void main(String[] args) {

		String tmp = "abcdefghijklmnopqrstuvwxyz";
		byte b[] = tmp.getBytes();
		ByteArrayInputStream input1 = new ByteArrayInputStream(b);
		ByteArrayInputStream input2 = new ByteArrayInputStream(b, 0, 3);
	
	}
}
