package com.ciecc.fire.leaning.io.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {
		try (FileReader fr = new FileReader("src/com/ciecc/fire/leaning/io/reader/FileReaderDemo.java")){
			int c;
			while ((c = fr.read())  != -1) {
				System.out.print((char) c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
