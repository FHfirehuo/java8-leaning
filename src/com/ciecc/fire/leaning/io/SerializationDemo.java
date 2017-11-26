package com.ciecc.fire.leaning.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 串行化和反串行化（及序列化和反序列化）
 * @author fire
 *
 */
public class SerializationDemo {

	public static void main(String[] args) {
		try(ObjectOutputStream objOStrm = new ObjectOutputStream(new FileOutputStream("serial"))){
			MyClass obj = new MyClass("hello", -7, 2.7e10);
			System.out.println("obj" + obj);
			objOStrm.writeObject(obj);
		}catch (Exception e) {
			System.out.println("" + e);
		}
		
		try (ObjectInputStream objIstrm = new ObjectInputStream(new FileInputStream("serial"))){
			MyClass obj2 = (MyClass) objIstrm.readObject();
			System.out.println("obj2" + obj2);
		} catch (FileNotFoundException e) {
			System.out.println("" + e);
		} catch (IOException e) {
			System.out.println("" + e);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}

class MyClass implements Serializable{

	private static final long serialVersionUID = 5442309988790668709L;
	String s;
	int i;
	double d;
	
	public MyClass(String s, int i, double d) {
		this.s =s;
		this.i =i;
		this.d = d;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MyClass [s=").append(s).append(", i=").append(i).append(", d=").append(d).append("]");
		return builder.toString();
	}
	
	
}
