package com.ciecc.fire.leaning.lambda;

public class VarCapture {

	public static void main(String[] args) {
		int num = 10;
		MyFunc mylambda = n -> {
			int v = num + n;
			//num ++;
			return v;
		};
	}
}
