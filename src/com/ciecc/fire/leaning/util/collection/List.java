package com.ciecc.fire.leaning.util.collection;

import java.util.ArrayList;
import java.util.HashMap;

public class List {

	public static void main(String[] args) {
		//java.util.List<Integer> a = new ArrayList<>(29);
		//System.out.println(a);
		
		//HashMap<String, String> b = new HashMap<>(18);
		
		Thread t = new Thread(new Runnable() {
			public void run() {
				
				/*while(!Thread.interrupted()){
					long i;
					for (i = 0; i < Integer.MAX_VALUE; i++) {
						
					}
					System.out.println(i);
		        }*/
				
				long i;
				for (i = 0; i < 3 * Integer.MAX_VALUE; i++) {
					
				}
				System.out.println(i);
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				for (i = 0; i < 3 * Integer.MAX_VALUE; i++) {
					
				}
				System.out.println(i);
				
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				for (i = 0; i < 4 * Integer.MAX_VALUE; i++) {
					
				}
				System.out.println(i);
				
				
			}
		}, "test");
		
		new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 20; i++) {
					System.out.println("State:" + t.getState());
					System.out.println("Alive:" + t.isAlive());
					System.out.println("isInterrupted:" + t.isInterrupted());
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				//notify();
				
			}
		}).start();
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t.start();
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t.notify();
		/*try {
			t.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t.notify();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
		/*try {
			t.wait(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
		//t.interrupt();
		
	}
}
