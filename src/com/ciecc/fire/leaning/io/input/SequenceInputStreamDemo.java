package com.ciecc.fire.leaning.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

/***
 * sequenceInputStream 类允许链接多个Input对象。
 * @author fire
 *
 */
public class SequenceInputStreamDemo {
	public static void main(String[] args) {
		int c;
		Vector<String> files = new Vector<>();
		
		files.addElement("test0.txt");
		files.addElement("test1.txt");
		files.addElement("test2.txt");
		
		InputStreamEnumerator ise = new InputStreamEnumerator(files);
		InputStream input = new SequenceInputStream(ise);
		
		try {
			while ((c = input.read()) != -1) {
				System.out.print((char)c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
