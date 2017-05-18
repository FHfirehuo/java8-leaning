package com.ciecc.fire.leaning.annotation;

import java.lang.reflect.Method;


class Meta4 {

	public static void main(String[] args) {
		myMeth();

	}
	
	@MyAnno2()
	public static void myMeth() {
		Meta4 ob = new Meta4();
		
		try {
			Class<?> c = ob.getClass();
			
			Method m = c.getMethod("myMeth");
			
			MyAnno2 anno = m.getAnnotation(MyAnno2.class);
			
			System.out.println(anno.str() + " " + anno.val());
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
