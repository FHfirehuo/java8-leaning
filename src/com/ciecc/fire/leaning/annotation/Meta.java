package com.ciecc.fire.leaning.annotation;

import java.lang.reflect.Method;

class Meta {

	public static void main(String[] args) {
		myMeth("test", 10);

	}
	
	@MyAnno(str = "Two Parameters", val = 19)
	public static void myMeth(String str, int i) {
		Meta ob = new Meta();
		
		try {
			Class<?> c = ob.getClass();
			
			Method m = c.getMethod("myMeth", String.class, int.class);
			
			MyAnno anno = m.getAnnotation(MyAnno.class);
			
			System.out.println(anno.str() + " " + anno.val());
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}
	

}
