package com.ciecc.fire.leaning.lambda;
/**
 * @see DoubleNumericArrayFunc
 * @see LambdaExceptionDemo
 * @author fire
 *
 */
public class EmptyArrayException extends Exception {

	private static final long serialVersionUID = 1L;
	public EmptyArrayException() {
		super("Array Empty");
	}

}
