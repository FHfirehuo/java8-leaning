package com.ciecc.fire.leaning.generic;

//演示泛型类
// Demonstrate the generic class
public class GenDemo {
	public static void main(String[] args) {
		// 创建一个对intergers的泛型引用
		Gen<Integer> iOb;
		
		//创建一个Gen <Integer>对象并将其引用分配给iOb
		//create a Gen<Integer> object and assign its reference to iOb
		
		//请注意使用自动装箱来将值88封装在Integer对象中
		//notice the use of autoboxing to encapsulate the value 88 within an Integer object
		iOb = new Gen<Integer>(88);
		iOb.showTpye();
		
		//get the value in iOb. notice that no cast is needed
		//获得iOb中的值.注意不需要转换
		int v = iOb.getob();
		System.out.println("value: " + v);
		
		Gen<String> strOb = new Gen<String>("Generics Test");
		
		strOb.showTpye();
		String str = strOb.getob();
		System.out.println("value: " + str);
	}
	
	
}
