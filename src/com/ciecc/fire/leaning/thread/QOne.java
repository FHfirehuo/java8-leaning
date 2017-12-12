package com.ciecc.fire.leaning.thread;

public class QOne implements Q {

	int n;
    public synchronized int get(){
        System.out.println("Get:"+n);
        return n;
    }

    public synchronized void put(int n) {
        this.n = n;
        System.out.println("Put:"+n);
    }
}
