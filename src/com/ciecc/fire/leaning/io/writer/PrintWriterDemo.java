package com.ciecc.fire.leaning.io.writer;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) {
		PrintWriter pw = null;
		String name = "张松伟";
		int age = 22;
		float score = 32.5f;
		char sex = '男';
		try {
			//new FileWriter(), true
			pw = new PrintWriter(new File("file.txt"));
			pw.printf("姓名：%s;年龄：%d;性别：%c;分数：%5.2f;", name, age, sex, score);
			pw.println();
			pw.println("多多指教");
			pw.write(name.toCharArray());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pw.close();
		}
	}

}
