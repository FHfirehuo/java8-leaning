package com.ciecc.fire.leaning.io.output;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo {

	public static void main(String[] args) {
		ByteArrayOutputStream f = new ByteArrayOutputStream();
		String s = "This should end up in the array";
		byte buf[] = s.getBytes();
		try {
			f.write(buf);
		} catch (IOException e) {
			System.out.println("");
			return;
		}
		
		System.out.println("Buffer as a String");
		
		System.out.println(f.toString());
		System.out.println("Into array");
		byte b[] = f.toByteArray();
		for (int i = 0; i < b.length; i++) {
			System.out.print((char)b[i]);
		}
		
		System.out.println("\nTo an OutputStream()");
		
		try(FileOutputStream fos = new FileOutputStream("src/com/ciecc/fire/leaning/io/file/test4.txt")){
			f.writeTo(fos);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		
		System.out.println("doing a reset");
		f.reset();
		
		for (int i = 0; i <  3; i++) {
			f.write('X');
		}
		
		System.out.println(f.toString());
	}
}
