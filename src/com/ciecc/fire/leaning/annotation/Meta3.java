package com.ciecc.fire.leaning.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@What(description="An annotation test class")
@MyAnno(str = "Mete3", val = 99)
class Meta3 {

	public static void main(String[] args) {
		myMeth();

	}
	
	@What(description="An annotation test method")
	@MyAnno(str = "testing", val = 100)
	public static void myMeth() {
		Meta3 ob = new Meta3();
		
		try {
				Annotation annos[] = ob.getClass().getAnnotations();
				System.out.println("All annotations for Meta3");
				
				for(Annotation a : annos){
					System.out.println(a);
				}
				
				System.out.println();
				Method m = ob.getClass().getMethod("myMeth");
			
				annos = m.getAnnotations();
				System.out.println("All annotations for myMeth");
				for(Annotation a : annos){
					System.out.println(a);
				}
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
