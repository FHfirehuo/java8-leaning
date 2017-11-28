package com.ciecc.fire.leaning.enumeration;

public class EnmuDemo3 {

	public static void main(String[] args) {

		//Apple ap;
		System.out.println("Winesap consts " + Apple.Winesap.getPrice() + " cents \n");

		System.out.println("All apple prices:");

		for (Apple a : Apple.values()) {
			System.out.println(a + " costs " + a.getPrice() + " cents.");
		}

	}
}
