package com.ciecc.fire.leaning.io.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

	public static void main(String[] args) {
		File f = new File("file.txt");
		try (RandomAccessFile raf =new RandomAccessFile(f,"rw")){
			//rw,读写，r只读
			//打开文件时，文件指针在开头，pointer = 0;
			raf.write('a');//write方法只会写一个字节，同时直接指针指向下一个位置
			int b = raf.read();//每次读一个字节，java中每个字符占用两个字节，使用右移8位的方式分次写入
			raf.seek(10);//移动指针
			raf.close();//文件读写完一定要关闭，否则可能会有意想不到的后果
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
