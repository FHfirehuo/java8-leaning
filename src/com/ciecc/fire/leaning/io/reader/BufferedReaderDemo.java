package com.ciecc.fire.leaning.io.reader;

import java.io.BufferedReader;
import java.io.CharArrayReader;

import com.ciecc.fire.leaning.io.input.BufferedInputStreamDemo;

/**
 * 关闭bufferedReader对象也会导致inputStream指定的底层流被关闭。
 * 与面向字节的流一样，缓冲的输入流也提供了在可用缓冲取中向后移动所需要的基础。
 * 
 * @author fire
 * @see BufferedInputStreamDemo
 */
public class BufferedReaderDemo {

	public static void main(String[] args) {
		String s = "this 刘燚 is a &copy; copyright symbol but this is &copy not.\n";

		char buf[] = new char[s.length()];
		s.getChars(0, s.length(), buf, 0);

		CharArrayReader in = new CharArrayReader(buf);
		int c;
		boolean marked = false;
		try (BufferedReader f = new BufferedReader(in)) {
			//f.readLine();
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
			System.out.println(e);
		}
	}
}
