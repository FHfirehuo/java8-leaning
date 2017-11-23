package com.ciecc.fire.leaning.generic.inte;

/***
 * 请特别注意Myclass声明类型参数T以及将T传递给MinMax的方式。
 * 因为MinMax需要实现了Comparable的类型，所以实现类（在该例中是MyClass）必须指定相同的界限。
 * 此外，一旦建立这个界限，就不需要再在implements子句中指定。实际上，那么做是错误的。
 * 例如，下面这行代码是不正确的，不能通过编译：
 *  class MyClass<T extends Comparable<T>> implements MinMax<T extends Comparable<T>> {
 *  
 *  一旦建立类型参数，就可以不加修改的将之传递接口。
 *  一般而言，如果类实现了泛型接口，那么类也必须是泛型化的，至少需要带有将被传递给接口的类型参数。例如，下面对MyClass的声明是错误的：
 *  class MyClass implements MinMax<T> {
 *  因为MyClass没有声明类型参数，所以无法为MinMax传递类型参数,对于这种情况,标识符T是未知的，编译器会报告错误。
 *  当然，如果类实现了某种具体类型的泛型接口，如下所示：
 *  class MyClass implements MinMax<Integer> {
 *  @see MyClass2
 *  那么实现类不需要泛型化的。
 * @author fire
 *
 * @param <T>
 */
public class MyClass<T extends Comparable<T>> implements MinMax<T> {
	
	T[] vals;
	
	public MyClass() {
		
	}


	public MyClass(T[] vals) {
		this.vals = vals;
	}


	@Override
	public T min() {
		
		T v = vals[0];
		for(int i =1; i < vals.length; i++){
			if(vals[i].compareTo(v) < 0) v = vals[i];
		}
		return v;
	}

	@Override
	public T max() {
		T v = vals[0];
		for(int i =1; i < vals.length; i++){
			if(vals[i].compareTo(v) > 0) v = vals[i];
		}
		return v;
	}

}
