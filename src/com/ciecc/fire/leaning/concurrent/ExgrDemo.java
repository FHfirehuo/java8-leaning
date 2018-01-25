package com.ciecc.fire.leaning.concurrent;

import java.util.concurrent.Exchanger;

public class ExgrDemo {

	public static void main(String[] args) {
		Exchanger<String> exgr = new Exchanger<String>();
		new UseString(exgr);
		new MarkString(exgr);
	}
}

class MarkString implements Runnable{

	Exchanger<String> ex;
	String str = new String();

	
	
	public MarkString(Exchanger<String> ex) {
		this.ex = ex;
		new Thread(this).start();
	}

	@Override
	public void run() {
		char ch = 'A';
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				str += ch++;
			}
			
			try {
				System.out.println("开始交换");
				str = ex.exchange(str);
				System.out.println("交换结束");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
	
}

class UseString implements Runnable{

	Exchanger<String> ex;
	String str;
	
	
	
	public UseString(Exchanger<String> ex) {
		this.ex = ex;
		new Thread(this).start();
	}



	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			try {
				System.out.println("开始获取");
				str =ex.exchange(new String());
				System.out.println("Got: " + str);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
