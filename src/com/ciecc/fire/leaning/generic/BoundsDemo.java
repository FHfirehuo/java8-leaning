package com.ciecc.fire.leaning.generic;

public class BoundsDemo {

	public static void main(String[] args) {
		
		Integer inums[] = {1, 2, 3, 4, 5, 6};

		Stats<Integer> iob = new Stats<>(inums);
		
		double v = iob.average();
		System.out.println("iob average is " + v);
		
		Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5, 6.5};

		Stats<Double> dob = new Stats<>(dnums);
		
		double w = dob.average();
		System.out.println("w average is " + w);
		
		if(iob.sameAvg(dob)){
			
		}
	}

}
