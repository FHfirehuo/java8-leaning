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
		
		// First, obtain a path to the file
		//首先，获取文件的路径
		try {
			filepath = Paths.get("test.txt");
		} catch (Exception e) {
			System.out.println("path error" + e);
			return;
		}
		
		//Next, obtain a channel to that file within a try-with-resources block
		//接下来，在try-with-resources块中获取该文件的一个通道
		try (SeekableByteChannel fChan = Files.newByteChannel(filepath)){

			// Allocate a buffer
			//分配一个缓冲区
			ByteBuffer mbuf = ByteBuffer.allocate(128);
			
			do{
				//Read a buffer
				//读一个缓冲区
				count = fChan.read(mbuf);
				//System.out.println(count);
//				128
//				128
//				128
//				128
//				85
//				-1
				
				//Stop when end of file is reached
				//到达文件结尾时停止
				if(count != -1){
					mbuf.rewind();
					
					//Read bytes buffer so that it can be read
					//读取字节缓冲区，以便可以读取
					//them on the screen as characters
					//他们在屏幕上作为字符
					for (int i = 0; i < count; i++) {
						System.out.print((char)mbuf.get());
					}
				}
					
			}while(count != -1);
			
			System.out.println();
		} catch (Exception e) {
			System.out.println("I/O error" + e);
		}
	}

}
