package com.ciecc.fire.leaning.generic;

public class BoundsDemo {

	public static void main(String[] args) {
		
		float a = 1.25648624654654515246264F;
		double b = 1.25648624654654515246264F;
		double d = 1.25648624654654515246264;
		double e = 1.25648624654654513246264;
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
		System.out.println(e);
		System.out.println(e);
		Integer inums[] = {1, 2, 3, 4, 5};

		Stats<Integer> iob = new Stats<>(inums);
		
		double v = iob.average();
		System.out.println("iob average is " + v);
		
		Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};

		Stats<Double> dob = new Stats<>(dnums);
		
		double w = dob.average();
		System.out.println("dob average is " + w);
		
		Float fnums[] = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
		Stats<Float> fob = new Stats<>(fnums);
		double f =  fob.average();
		System.out.println("fob average is " + f);
		
		System.out.print("average of iob and dob");
		if(iob.sameAvg(dob)){
			System.out.println(" are the same");
		}else{
			System.out.println(" differ");
		}
		
		System.out.print("average of iob and fob");
		if(iob.sameAvg(fob)){
			System.out.println(" are the same");
		}else{
			System.out.println(" differ");
		}
	}

}
