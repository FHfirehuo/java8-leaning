package com.ciecc.fire.leaning.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InteAddressTest {

	public static void main(String[] args) throws UnknownHostException {

		InetAddress address = InetAddress.getLocalHost();
		System.out.println(address);
		
		address = InetAddress.getByName("WWW.baidu.com");
		System.out.println(address);
		
		InetAddress sw[] = InetAddress.getAllByName("WWW.baidu.com");
		for(int i=0; i<sw.length; i++){
			System.out.println(sw[i]);
		}
	}

}
