package com.ciecc.fire.leaning.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.BlockingQueue;

public class A {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("test");

		String[] array = new String[2];
		/**
		 * Arrays.asLisvt() 返回java.util.ArraysArrayList，而不是ArrayList。
		 * ArraysArrayList和ArrayList都是继承AbstractList，
		 * remove，add等method在AbstractList中是默认throw UnsupportedOperationException而且不作任何操作。
		 * ArrayList override这些method来对list进行操作，
		 * 但是Arrays$ArrayList没有override remove(int)，add(int)等，
		 * 所以throw UnsupportedOperationException。
		 */
		List<String> list2 = Arrays.asList(array);

		List<String> list3 = new ArrayList<String>(list2);
		list3.add("test");
		//System.out.println(list2.get(0));
		array[0] = "test2";
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		//System.out.println(list2.get(2));
		//list2.add("test");
		System.out.println(list3.get(0));
		System.out.println(list3.get(1));
		System.out.println(list3.get(2));
		list3.add("test");
		System.out.println(list3.get(0));
		System.out.println(list3.get(1));
		System.out.println(list3.get(2));
		
		float a = 1.1f;
		double d = 1.1;
		int c = Float.floatToIntBits(a);
		System.out.println(c);
		long f = Double.doubleToLongBits(d);
		System.out.println(f);
		
	}

}
