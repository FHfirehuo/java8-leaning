package com.ciecc.fire.leaning.util.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public class All {

	public static void main(String[] args) {
		
		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		
		List<Integer> b = new LinkedList<>();
		
		
		
		HashMap<String, String> d = new HashMap<>(18);
		
		ConcurrentHashMap<String, String> r = new ConcurrentHashMap<>(18);
		//d.
		
		LinkedList<String> ll = new LinkedList<>();
		
		HashSet<String> hs = new HashSet<>();
		
		int cap = 10;
		 int n = cap - 1;
	        n |= n >>> 1;
	        n |= n >>> 2;
	        n |= n >>> 4;
	        n |= n >>> 8;
	        n |= n >>> 16;
	    System.out.println((n < 0) ? 1 :  n + 1);
	    
	    LinkedHashSet<String> lhs = new LinkedHashSet<>();
	    
	    TreeSet<String> ts = new TreeSet<>();
	    
	    TreeMap<String, String> tm = new TreeMap<>();
	    
	    LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
	    
	}
}
