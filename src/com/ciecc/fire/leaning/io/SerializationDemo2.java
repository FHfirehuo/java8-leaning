package com.ciecc.fire.leaning.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class SerializationDemo2 {

	public static void main(String[] args) {
		try(ObjectOutputStream objOStrm1 = new ObjectOutputStream(new FileOutputStream("serial1.txt"));
				ObjectOutputStream objOStrm2 = new ObjectOutputStream(new FileOutputStream("serial2.txt"));
				ObjectOutputStream objOStrm3 = new ObjectOutputStream(new FileOutputStream("serial3.txt"));
				ObjectOutputStream objOStrm4 = new ObjectOutputStream(new FileOutputStream("serial4.txt"));
				ObjectOutputStream objOStrm5 = new ObjectOutputStream(new FileOutputStream("serial5.txt"));
				ObjectOutputStream objOStrm6 = new ObjectOutputStream(new FileOutputStream("serial6.txt"));
				){
			int iobi[] = {1,2,3,4};
			objOStrm1.writeObject(iobi);
			
			char cobi[] = {'1','2','3','a'};
			objOStrm2.writeObject(cobi);
			
			boolean bobi[] = {true,false};
			objOStrm3.writeObject(bobi);
			
			String sobi[] = {"liu", "一"};
			objOStrm4.writeObject(sobi);
			
		}catch (Exception e) {
			System.out.println("" + e);
		}
		
		try (ObjectInputStream objIstrm1 = new ObjectInputStream(new FileInputStream("serial1.txt"));
				ObjectInputStream objIstrm2 = new ObjectInputStream(new FileInputStream("serial2.txt"));
				ObjectInputStream objIstrm3 = new ObjectInputStream(new FileInputStream("serial3.txt"));
				ObjectInputStream objIstrm4 = new ObjectInputStream(new FileInputStream("serial4.txt"));
				ObjectInputStream objIstrm5 = new ObjectInputStream(new FileInputStream("serial5.txt"));
				ObjectInputStream objIstrm6 = new ObjectInputStream(new FileInputStream("serial6.txt"))){
			int iobi[] = (int[]) objIstrm1.readObject();
			System.out.println("iobi" + Arrays.toString(iobi));
			
			char cobi[] = (char[]) objIstrm2.readObject();
			System.out.println("cobi" + Arrays.toString(cobi));
			
			boolean bobi[] = (boolean[]) objIstrm3.readObject();
			System.out.println("bobi" + Arrays.toString(bobi));
			
			String sobi[] = (String[]) objIstrm4.readObject();
			System.out.println("sobi" + Arrays.toString(sobi));
			
			
		} catch (FileNotFoundException e) {
			System.out.println("" + e);
		} catch (IOException e) {
			System.out.println("" + e);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
