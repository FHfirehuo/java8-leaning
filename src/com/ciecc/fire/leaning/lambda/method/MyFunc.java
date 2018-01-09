package com.ciecc.fire.leaning.lambda.method;

//use an instance method reference with difference objects;
//使用差异对象的实例方法引用

//a functional interface that tasks two reference arguments and return a boolean result
//一个任务两个引用参数的函数接口，并返回一个布尔结果
/**
 * @see HighTemp
 * @see InstanceMethWithObjectRefDemo
 * @author fire
 *
 * @param <T>
 */
public interface MyFunc<T> {

	boolean func(T v1, T v2);
}
