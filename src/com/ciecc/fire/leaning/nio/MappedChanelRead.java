package com.ciecc.fire.leaning.nio;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MappedChanelRead {

	public static void main(String[] args) {
		// Obtain a channel to a file within a try-with-resources block
		try(FileChannel fChan = (FileChannel) Files.newByteChannel(Paths.get("test.txt"))){
			//Get the size of the file
			long fSize = fChan.size();
			
			MappedByteBuffer mBuf = fChan.map(FileChannel.MapMode.READ_ONLY, 0, fSize);
			for(int i = 0; i < fSize; i++){
				System.out.print((char)mBuf.get());
			}
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
