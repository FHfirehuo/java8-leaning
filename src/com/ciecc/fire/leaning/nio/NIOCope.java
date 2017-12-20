package com.ciecc.fire.leaning.nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class NIOCope {

	public static void main(String[] args) {

		if(args.length !=2 ) {
			System.out.println("Usage: Cope from to");
			return;
		}
		
		try {
			Path source = Paths.get(args[0]);
			Path target = Paths.get(args[1]);
			Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
			
		} catch (Exception e) {
		}
	}

}
