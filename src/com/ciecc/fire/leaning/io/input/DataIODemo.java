package com.ciecc.fire.leaning.io.input;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataIODemo {

	public static void main(String[] args) {
		try (DataOutputStream dout = new DataOutputStream(new FileOutputStream(""))){
			
			dout.writeDouble(98.6);
			
		} catch (Exception e) {
			
		}
	}

}
