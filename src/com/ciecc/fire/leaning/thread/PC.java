package com.ciecc.fire.leaning.thread;

public class PC {

	public static void main(String[] args) {
		/*Q q = new Q();
        new Producer(q);
        new Consumer(q);*/
		
		QTwo q = new QTwo();
        new Producer(q);
        new Consumer(q);

	}

}
