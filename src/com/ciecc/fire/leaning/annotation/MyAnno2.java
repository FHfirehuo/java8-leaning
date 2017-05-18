package com.ciecc.fire.leaning.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno2 {

	String str() default "testing";
	int val() default 9999;
}
