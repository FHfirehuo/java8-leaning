package com.ciecc.fire.leaning.generic;

/**
 * 
 * @author fire
 *
 * @param <T>
 */
public class Stats<T extends Number> {

	T[] nums; 
	
	Stats(T[] o){
		nums = o;
	}
	
	double average() {
		double sum = 0.0;
		for (int i=0; i < nums.length; i++){
			sum += nums[i].doubleValue();
		}
		return sum / nums.length;
	}
	
	// tbis won't work
	//determine if two averages are the same
	/*public boolean sameAvg(Stats<T> ob) {
		if(average() == ob.average()){
			return true;
		}
		return false;
	}*/
	
	public boolean sameAvg(Stats<?> ob) {
		if(average() == ob.average()){
			return true;
		}
		return false;
	}
}
/**
除了使用类作为边界之外也可以使用接口。实际上，可以指定多个接口作为边界。此外，边界可以包含一个类和一个或多个接口。对于这种情况，必须首先指定类类型。
如果边界包含接口类型，那么只有实现了那种接口的类型参数是合法的。当指定具有一个类和一个或多个接口的边界是，使用&运算符链接它们.例如
class Gen < T extends MyClass & MyInteface>{ // ...
**/