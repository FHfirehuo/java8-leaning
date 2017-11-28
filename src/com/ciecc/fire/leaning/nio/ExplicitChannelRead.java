package com.ciecc.fire.leaning.nio;

import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class ExplicitChannelRead {

	public static void main(String[] args) {
		int count = 0;
		Path filepath = null;
		
		
		try {
			filepath = Paths.get("test.txt");
		} catch (Exception e) {
			System.out.println("path error" + e);
			return;
		}
		
		try (SeekableByteChannel fByteChannel = Files.newByteChannel(filepath)){

			ByteBuffer mbuf = ByteBuffer.allocate(128);
			mbuf.reset();
			do{
				
			}while(count != -1);
			
			System.out.println();
		} catch (Exception e) {
			System.out.println("I/O error" + e);
		}
	}

}
