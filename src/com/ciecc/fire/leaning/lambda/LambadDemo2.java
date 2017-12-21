package com.ciecc.fire.leaning.lambda;

/**
 * {@link NumericTest}
 * @author fire
 *
 */
public class LambadDemo2 {

	public static void main(String[] args) {
		NumericTest isEven = (n) -> (n % 2) == 0;
		if(isEven.test(10)) System.out.println("10 is even");
		if(!isEven.test(9)) System.out.println("9 is not even");
		
		NumericTest isNonNeg = (n) -> n >= 0;
		if(isNonNeg.test(1)) System.out.println("1 is non-negative");
		if(!isNonNeg.test(-1)) System.out.println("-1 is negative");
		
		//当只有一个参数时，在操作符的左侧指定该参数时,没有必要使用括号括住改参数的名称
		NumericTest isAntherNonNeg = n -> n >= 0;
		if(isAntherNonNeg.test(1)) System.out.println("1 is non-negative");
	}
}
