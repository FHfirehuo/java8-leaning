package com.ciecc.fire.leaning.io.file;

import java.io.File;
import java.nio.file.Path;

public class FileDemo {
	
	static void p(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		File f1 = new File("/java/COPYRIGHT");
		p("File name: " + f1.getName());
		p("Path: " + f1.getPath());
		p("abs Path: " + f1.getAbsolutePath()); //返回此抽象路径名的绝对路径名字符串。
		p("Parent: " + f1.getParent());
		
		p(f1.exists() ? "exists" : "does not exist");
		p(f1.canWrite() ? "is writeable" : "is not writeable");
		p(f1.canRead() ? "is readable" : "is not readable");
		p("is " + (f1.isDirectory()? "" : "not" + " a directory"));
		p(f1.isFile() ? "is normal file" : "might be a name pipe"); //可能是一个名字管道
		p(f1.isAbsolute() ? "is absolute" : "is not absolute");
		p("File last modifed: " + f1.lastModified());
		p("File  size: " + f1.length() + " Bytes");
		File f2 = new File("/java/COPYRIGHT/a.text");
		p(f1.renameTo(f2) ? "" : "not" + " rename");
		p(f1.delete() ? "" : "not" + " deleted");
		
		f1.deleteOnExit(); //当Java虚拟机终止时，删除与调用对象关联的文件
		f1.getFreeSpace(); //返回在与调用对象关联的分区中，剩余储存空间的字节
		f1.getTotalSpace(); //返回在与调用对象关联的分区的储存容量
		f1.getUsableSpace(); ////剩余可用字节数
		f1.isHidden();
		f1.setLastModified(11);
		f1.setReadOnly();
		Path p = f1.toPath();
		f1.canWrite();
		p.getFileName();
		
	}

}
