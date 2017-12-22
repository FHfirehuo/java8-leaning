package com.ciecc.fire.leaning.nio;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NIOStreamWrite {

	public static void main(String[] args) {
		try(OutputStream fout = new BufferedOutputStream(Files.newOutputStream(Paths.get("test.txt")))){
			
			for(int i = 0; i < 26; i++){
				fout.write((char)('A'+i));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
				
	}
}
