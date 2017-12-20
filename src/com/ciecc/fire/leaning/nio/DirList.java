package com.ciecc.fire.leaning.nio;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class DirList {

	public static void main(String[] args) {
		String dirname = "C:\\Users\\fire\\git\\";
		try (DirectoryStream<Path> dirstrm = Files.newDirectoryStream(Paths.get(dirname))){
			System.out.println("Directory of " + dirname);
			for(Path entry: dirstrm){
				BasicFileAttributes attribs
				= Files.readAttributes(entry, BasicFileAttributes.class);
				if(attribs.isDirectory()){
					System.out.print("<DIR>");
				}else{
					System.out.println("    ");
				}
				System.out.println(entry.getName(1));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
