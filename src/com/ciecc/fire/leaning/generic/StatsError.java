package com.ciecc.fire.leaning.generic;

/**
 * stats attempts (unsuccessfully) to create a generic class
 *  that can compute the average of an array of numbers of any given type

 * 统计尝试（不成功）创建一个泛型类，可以计算任何给定类型的数字数组的平均值
 * @author fire
 *
 * @param <T>
 */
public class StatsError<T> {

	T[] nums; 
	
	StatsError(T[] o){
		nums = o;
	}
	
	double average() {
		double sum = 0.0;
		for (int i=0; i < nums.length; i++){
			//sum += nums[i].doubleValue(); //Error!!!
			/**
			 * 所有数值类，比如Interger，一集double， 都是number的子类，
			 * 而number定义了double value（）方法，
			 * 所以所有数值类的封装器都可以使用该方法。
			 * 问题是编译器不知道你正在试图创建只使用数值类型的stats对象。因此，当试图编译stats时，会报错误。
			 * 为了解决这个问题，需要以某种方式告诉编译器，你打算只向T传递值类型，此外需要保证确实只传递值类型。
			 * 
			 */
		}
		return sum / nums.length;
	}
}
