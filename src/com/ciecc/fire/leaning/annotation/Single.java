package com.ciecc.fire.leaning.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/***
 * 但成员注解
 * @author fire
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@interface MySingle{
	int value(); // this variable name must be value
}

class Single {
	
	@MySingle(100)
	public static void myMeth(){
		Single ob = new Single();
		
		try {
			Method m = ob.getClass().getMethod("myMeth");
			MySingle anno = m.getAnnotation(MySingle.class);
			
			System.out.println(anno.value());
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		myMeth();
	}
}
