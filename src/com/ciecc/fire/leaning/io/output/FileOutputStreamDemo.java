package com.ciecc.fire.leaning.io.output;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		String source = "Now is the time for all good men\n"
				+ " to come to the aid of their countr"
				+ " and pay thire due taxes";
		
		byte buf[] = source.getBytes();
		
		FileOutputStream f0 = null;
		FileOutputStream f1 = null;
		FileOutputStream f2 = null;
		
		try {
			f0 = new FileOutputStream("src/com/ciecc/fire/leaning/io/file/test0.txt");
			f1 = new FileOutputStream("src/com/ciecc/fire/leaning/io/file/test1.txt");
			f2 = new FileOutputStream("src/com/ciecc/fire/leaning/io/file/test2.txt");
			
			//
			for (int i = 0; i < buf.length; i += 2) {
				f0.write(buf[i]);
			}
			
			f1.write(buf);
			
			f2.write(buf, buf.length-buf.length/4, buf.length/4);
		} catch (Exception e) {
			System.out.println();
		} finally {
			
			try {
				if(f0 != null){
					f0.close();
				}
			} catch (IOException e) {
				System.out.println("error closing file0.txt");
			}
			
			try {
				if(f1 != null){
					f1.close();
				}
			} catch (IOException e) {
				System.out.println("error closing file1.txt");
			}
			
			try {
				if(f2 != null){
					f2.close();
				}
			} catch (IOException e) {
				System.out.println("error closing file02.txt");
			}
		}
		
	}
	
	//这个版本更短并且更流线化
	public static void main2(String[] args) {
		String source = "Now is the time for all good men\n"
				+ " to come to the aid of their countr"
				+ " and pay thire due taxes";
		
		byte buf[] = source.getBytes();
		
		try (FileOutputStream f0 = new FileOutputStream("src/com/ciecc/fire/leaning/io/file/test0.txt");
				FileOutputStream f1 = new FileOutputStream("src/com/ciecc/fire/leaning/io/file/test1.txt");
				FileOutputStream f2 = new FileOutputStream("src/com/ciecc/fire/leaning/io/file/test2.txt");){
			
			
			//
			for (int i = 0; i < buf.length; i += 2) {
				f0.write(buf[i]);
			}
			
			f1.write(buf);
			
			f2.write(buf, buf.length-buf.length/4, buf.length/4);
		} catch (Exception e) {
			System.out.println("an I/O error occurred");
		}
		
	}
}
