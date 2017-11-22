package com.ciecc.fire.leaning.generic.meth;

/***
 * 非泛型类中创建泛型方法
 * 
 * @author fire
 *
 */
public class GenMethDemo {
	
	/**
	 * 注意： 对于泛型方法，类型参数列表位于返回类型之前
	 * @param x
	 * @param y
	 * @return
	 */
	static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
		for(int i = 0; i < y.length; i++){
			if(x.equals(y[i])){
				return true;
			}
		}
		return false;
		
	}

	public static void main(String[] args) {
		Integer nums[] = {1, 2, 3, 4, 5};
		if(isIn(2, nums)){
			System.out.println("2 is in nums");
		}
		
		if(!isIn(7, nums)){
			System.out.println("7 is not in nums");
		}
		
		String strs[] = {"one", "two", "three", "four", "five"};
		if(isIn("two", strs)){
			System.out.println("two is in strs");
		}
		
		if(!isIn("seven", strs)){
			System.out.println("seven is not in strs");
		}
		
		/***
		 * 尽管对于大多数泛型方法调用，类型推断就足够用了，但是需要时，也可以显示指定类型参数。例如，下面显示了指定类型参数时队isIn（）方法的第一次调用：
		 * GenMethDemo.<Integer, Integer> isIn(2, nums)
		 * 当然，在本例中， 指定类型参数不会带来什么好处。而且，jdk8改进了有关方法的类型推断。所以，需要显示指定类型参数的场合不太多。
	
		 */
		
	}

}
