package com.ciecc.fire.leaning.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/**
 * 标记注解
 * @author fire
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker{}

public class Marker {

	/***
	 * 应用 @MyMarker 是后面不需要有圆括号。
	 * 提供圆括号虽然不是错误，但不是必须的 
	 */
	@MyMarker
	public static void myMeth() {

		Marker ob = new Marker();
		
		
		try {
			Method m = ob.getClass().getMethod("myMeth");
			if(m.isAnnotationPresent(MyMarker.class)){
				System.out.println("MyMarker is pressent");
			}
		} catch (NoSuchMethodException e) {
			System.out.println("MyMarker not fund");
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		myMeth();
	}
}
