package com.ciecc.fire.leaning.io.output;

/***
 * PrintStream 提供了System文件句柄System.out的所有输出功能。
 * 
 * @author fire
 *
 */
public class PrintfDemo {

	public static void main(String[] args) {
		System.out.println("Here are some numberic values in diferent formate.\n");
		
		System.out.println("Various integer formates:");
		System.out.printf("%d %(d %+d %05d\n", 3, -3, 3, 3);
		
		System.out.println();
		
		System.out.printf("Default floating-point format: %f\n", 1234567.123 );
		
		System.out.printf("Default floating-point commas: %,f\n", 1234567.123  );
		
		System.out.printf("Negative floating-point default: %,f\n", -1234567.123  );
		
		System.out.printf("Negative floating-point option: %,(f\n", -1234567.123  );
		System.out.println();
		System.out.printf("Line up positive and negative values:\n");
		System.out.printf("% ,.2f\n%, .2f\n", 123456.123, -123456.123);
		
	}

}
