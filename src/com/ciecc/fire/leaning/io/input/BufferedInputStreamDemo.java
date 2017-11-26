package com.ciecc.fire.leaning.io.input;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;

public class BufferedInputStreamDemo {

	public static void main(String[] args) {
		String s = "this is a &copy; copyright symbol but this is &copy not.\n";

		byte buf[] = s.getBytes();

		ByteArrayInputStream in = new ByteArrayInputStream(buf);
		int c;
		boolean marked = false;
		try (BufferedInputStream f = new BufferedInputStream(in)) {
			while ((c = f.read()) != -1) {
				switch (c) {
				case '&':
					if (!marked) {
						//在第一次标记时并没有发生调用rest但是第二次的标记发生了调用
						f.mark(1);//其实这个1并没有什么卵用官方api的解释并不正确
						marked = true;
					} else {
						marked = false;
					}
					break;
				case ';':
					if (marked) {
						marked = false;
						System.out.print("(c)");
					} else {
						System.out.print((char) c);
					}
					break;

				case ' ':
					
					if (marked) {
						//在&copy;后没有调用但是在&copy 发生了调用所以当调用到&copy后的 时指针又重新指向第二个&后
						marked = false;
						f.reset();
						System.out.print("&");
					} else {
						System.out.print((char) c);
					}
					break;

				default:
					if (!marked)
						System.out.print((char) c);

					break;
				}
			}
		} catch (Exception e) {

		}
	}
}
