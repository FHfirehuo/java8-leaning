package com.ciecc.fire.leaning.enumeration;

/**
 * 
 * 苹果的种类
 * 
 * @since 2015.10.12
 */
public enum Apple {
	Jonathan(10), ColdenDel(9), RedDel(12), Winesap(15), Cortland(8);
	private int price;

	private Apple(int p) {
		price = p;
	}

	int getPrice() {
		return price;
	}
}
