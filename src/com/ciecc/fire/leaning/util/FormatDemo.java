package com.ciecc.fire.leaning.util;

import java.util.Formatter;
/**
 * 一旦拥有格式化的字符串，就可以通过调用toString（）方法来获取.
 * 例如，继续前面的例子，下面的语句获取fmt中包含的格式化字符串：
 * <code>String str = fmt.toString();</code>
 * 
 * 当然，如果只是希望显示格式化字符串，那么没有必要首先将字符串赋予给String对象。
 * 例如，当将Formatter对象传递给println方法是，会自动调用Formatter对象的toString（）方法。
 * 
 * @author fire
 *
 */
public class FormatDemo {

	public static void main(String[] args) {
		Formatter fmt = new Formatter();
		fmt.format("Formatting %s is easy %d %f", "with Java", 10, 98.6);
		System.out.println(fmt);
		fmt.close();
	}

}
