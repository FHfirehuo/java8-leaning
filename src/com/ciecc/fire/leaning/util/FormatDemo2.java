package com.ciecc.fire.leaning.util;

import java.util.Formatter;

/**
 * 为了以十进制格式化整数，可以使用%d。为了
 * @author fire
 *
 */
public class FormatDemo2 {

	public static void main(String[] args) {
		Formatter fmt = new Formatter();
		for (double i = 1.23; i < 1.0e+6; i *= 10) {
			fmt.format("%f %e", i, i);
			System.out.println(fmt);
		}
		fmt.close();
	}

}
