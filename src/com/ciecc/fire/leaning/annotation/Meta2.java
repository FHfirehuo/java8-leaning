package com.ciecc.fire.leaning.annotation;

import java.lang.reflect.Method;


class Meta2 {

	public static void main(String[] args) {
		myMeth();

	}
	
	@MyAnno(str = "Annotation Example", val = 100)
	public static void myMeth() {
		Meta2 ob = new Meta2();
		
		try {
			Class<?> c = ob.getClass();
			
			Method m = c.getMethod("myMeth");
			
			MyAnno anno = m.getAnnotation(MyAnno.class);
			
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
