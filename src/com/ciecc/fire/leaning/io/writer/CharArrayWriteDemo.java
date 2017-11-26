package com.ciecc.fire.leaning.io.writer;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.ciecc.fire.leaning.io.output.ByteArrayOutputStreamDemo;

/**
 * close() 方法对chararraywrite没有影响
 * @author fire
 * 
 * @see ByteArrayOutputStreamDemo
 */
public class CharArrayWriteDemo {

	public static void main(String[] args) {
		CharArrayWriter f = new CharArrayWriter();
		String s = "this should end up in the array";
		char buf[] = new char[s.length()];
		
		s.getChars(0, s.length(), buf, 0);
		
		try {
			f.write(buf);
		} catch (IOException e) {
			System.out.println("error writing to buffer");
			return;
		}
		
		System.out.println();
		System.out.println(f.toString());
		System.out.println();
		
		char c[] = f.toCharArray();
		
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		
		System.out.println("\nTo a FileWriter()");
		
		try (FileWriter f2 = new FileWriter("fire.txt")){
			f.writeTo(f2);
		} catch (Exception e) {
			System.out.println("I/o Error: " +e);
		}
		
		System.out.println();
		
		f.reset();
		for (int i = 0; i < 3; i++) {
			f.write('x');
		}
		System.out.println(f.toString());
	}

}
