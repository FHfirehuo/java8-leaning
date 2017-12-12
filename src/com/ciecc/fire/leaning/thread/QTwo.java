package com.ciecc.fire.leaning.thread;

public class QTwo implements Q {

	boolean valueSet = false;
    int n;
    public synchronized int get(){
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Get:"+n);
        valueSet = false;
        notify();
        return n;
    }

    public synchronized void put(int n) {
        while (valueSet){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.n = n;
        valueSet = true;
        System.out.println("Put:"+n);
        notify();
    }
}
