package com.ciecc.fire.leaning.nio;

import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExplicitChannelWrite2 {

	public static void main(String[] args) {
		try (FileChannel fChan = (FileChannel) Files.newByteChannel(Paths.get("text.txt"), 
				StandardOpenOption.WRITE, StandardOpenOption.READ, StandardOpenOption.CREATE)){
			
			MappedByteBuffer mBuf = fChan.map(FileChannel.MapMode.READ_WRITE, 0, 26);
			
			for (int i = 0; i < 26; i++) {
				mBuf.put((byte) ('A' + i));
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
