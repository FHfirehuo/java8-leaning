package com.ciecc.fire.leaning.nio;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ShowFile {

	public static void main(String[] args) {
		int i;
		if(args.length != 1){
			System.out.println("Usage: ShowFile filename");
			return;
		}
		try (InputStream fin = Files.newInputStream(Paths.get(args[0]))){
			//new BufferedInputStream(Files.newInputStream(Paths.get(args[0])));
			do {
				i = fin.read();
				if(i!=-1){
					System.out.print((char)i);
				}
			} while (i != -1);
		} catch (Exception e) {
		}
	}
}
