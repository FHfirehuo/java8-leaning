package com.ciecc.fire.leaning.nio;

import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ExplicitChannelRead2 {

	public static void main(String[] args) {
		int count;
		//Here, the channel is opened on the Path returned by Paths.get()
		//There is no need for the filepath variable
		try (SeekableByteChannel fChan = Files.newByteChannel(Paths.get("test.txt"))){
			ByteBuffer mbuff = ByteBuffer.allocate(128);
			
			do {
				count = fChan.read(mbuff);
				if(count != -1){
					mbuff.rewind();
					for (int i = 0; i < count; i++) {
						System.out.print((char)mbuff.get());
					}
				}
			} while (count != -1);
		} catch (Exception e) {
		}
	}

}
