package com.ciecc.fire.leaning.enumeration;

public enum Week {

	Monday(1), Tuesday(2), Wednesday(3), Thursday(4), Friday(5), Saturday, Sunday;

	private int number;

	Week() {
		number = -1; // 将number 初始化为-1，表明不能获得星期数字.
	}

	Week(int day) {
		number = day;
	}

	public int getNumber() {
		return number;
	}
}
