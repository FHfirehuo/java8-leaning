package com.ciecc.fire.leaning.generic.inte;

public class GenIfDemo {

	public static void main(String[] args) {
		Integer inums[] = {3, 6, 2, 8, 6};
		Character chr[] = {'b', 'r', 'p', 'w'};
		
		MinMax<Integer> iob = new MyClass<>(inums);
		MinMax<Character> cob = new MyClass<>(chr);
		
		System.out.println("Max value in inums: " + iob.max());
		System.out.println("Min value in inums: " + iob.min());
		System.out.println("Max value in chr: " + cob.max());
		System.out.println("Min value in chr: " + cob.min());
		
	}

}
