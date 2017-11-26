package com.ciecc.fire.leaning.io.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * FileInputStream 及归属于file有归属于InputStream但严格意义上应该归属于InputStream
 * @author fire
 *
 */
public class FileInputStreamDemo {

	public static void main(String[] args) {
		int size;
		File f1 = new File("src/com/ciecc/fire/leaning/io/file/test.txt");
		//System.out.println(f1.getAbsolutePath());
		try(FileInputStream f = new FileInputStream(f1)){
			System.out.println("Total Available " + (size = f.available()));
			
			int n = size / 4;
			System.out.println("First " + n + " bytes of the file one read() at a time");
			for (int i = 0; i < n; i++) {
				System.out.print((char) f.read());
			}
			System.out.println("\nStill Available: " + f.available());
			
			System.out.println("Reading the next " + n + " with one read(b[])");
			
			byte b[] = new byte[n];
			if(f.read(b) != n) {
				System.out.println("couldn't read " + n + " bytes.");
			}
			System.out.println(new String(b, 0, n));
			System.out.println("\nStill Available: " + (size = f.available()));
			System.out.println("Skipping half of remaining bytes with skip()");
			
			f.skip(size/2);
			System.out.println("Still Available: " + f.available());
			System.out.println("Reading " + n/2 + " into the end of array");
			if (f.read(b, n/2, n/2) != n/2) { //从b的n/2位置保存新读取的字节，之前的内容还是上次读取的
				System.out.println("couldn't read " + n/2 + " bytes.");
			}
			System.out.println(new String(b, 0, b.length));
			System.out.println("\nStill Available: " + f.available());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
