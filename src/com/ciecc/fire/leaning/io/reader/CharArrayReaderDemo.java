package com.ciecc.fire.leaning.io.reader;

import java.io.CharArrayReader;
/**
 * CharArrayReader 实现的close不抛出任何异常，因为这不可能失败
 * @author fire
 *
 */
public class CharArrayReaderDemo {

	public static void main(String[] args) {
		String tmp = "abcdefghijklmnopqrstuvwxyz";
		int length = tmp.length();
		char c[] = new char[length];
		
		tmp.getChars(0, length, c, 0);
		int i;
		try (CharArrayReader imnput1 = new CharArrayReader(c)){
			System.out.println();
			while ((i = imnput1.read()) != -1) {
				System.out.print((char)i);
			}
			
			System.out.println();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		try (CharArrayReader imnput1 = new CharArrayReader(c, 1, 5)){
			System.out.println();
			while ((i = imnput1.read()) != -1) {
				System.out.print((char)i);
			}
			
			System.out.println();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
