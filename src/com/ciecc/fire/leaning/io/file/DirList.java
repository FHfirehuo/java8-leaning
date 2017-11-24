package com.ciecc.fire.leaning.io.file;

import java.io.File;

public class DirList {

	public static void main(String[] args) {
		String dirname = "D:/Java/jre1.8";
		File f1 = new File(dirname);
		
		if(f1.isDirectory()){
			System.out.println("Directory of" + dirname);
			String s[] = f1.list();
			
			for (int i = 0; i < s.length; i++) {
				File f = new File(dirname + "/" + s[i]);
				if(f.isDirectory()){
					System.out.println( s[i] + " is  a directory");
				} else {
					System.out.println( s[i] + " is not a directory");
				}
				
			}
		} else {
			System.out.println( dirname + " is not a directory");
		}
				
	}
}