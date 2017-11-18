package com.ciecc.fire.leaning.io;

import java.io.File;

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
	}

}
