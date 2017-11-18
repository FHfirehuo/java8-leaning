package com.ciecc.fire.leaning.generic;

public class NongenDemo {
	public static void main(String[] args) {
		NonGen iOb;
		
		//创建nongen对象并在其中存储一个Integer。 自动装箱仍然发生
		//create nongen Object and store an Ingeger in it. Autoboxing still occurs
		iOb = new NonGen(88);
		
		iOb.showType();
		
		int v = (Integer) iOb.getob();
		System.out.println("value:" + v);
		
		System.out.println();
		
		//create another nongen object and store a String in it
		//创建另一个nongen对象，并在其中存储一个字符串
		NonGen strOb = new NonGen("Non-Generics Test");
		
		strOb.showType();
		
		// get the value of strOb. again, notice that a cast is necessary
		//得到strOb的值。 再次注意，演员是必要的
		String str = (String) strOb.getob();
		
		System.out.println("value:" + str);
		
		//this compiles, but is conceptually wrong
		iOb = strOb;
		
		v = (int) iOb.getob();// run-time error
	}
}
