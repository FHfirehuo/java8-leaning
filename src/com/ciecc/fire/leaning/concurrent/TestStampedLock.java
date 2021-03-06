package com.ciecc.fire.leaning.concurrent;

import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.StampedLock;

public class TestStampedLock {
	
	
	
	

	 public static void main(String[] args) throws InterruptedException{
		    final StampedLock lock = new StampedLock();
		    
		    new Thread(){
		       public void run(){
		       long readLong = lock.writeLock();
		       LockSupport.parkNanos(6100000000L);
		       lock.unlockWrite(readLong);
		     }
		    }.start();
		    
		    Thread.sleep(100);
		    
		    for( int i = 0; i < 3; ++i)
		       new Thread(new OccupiedCPUReadThread(lock)).start();
		    }
	 
		    private static class OccupiedCPUReadThread implements Runnable{
		        private StampedLock lock;
		        public OccupiedCPUReadThread(StampedLock lock){
		            this.lock = lock;
		        }
		        
		        
		        public void run(){
		        	
		        	boolean interrupted = false;

		        	if(interrupted)
		        		Thread.currentThread().interrupt();
		        	//return ns;

		            //Thread.currentThread().interrupt();
		            //然而在readLock方法（即不响应中断）中存在问题(write的版本也是)，观察CPU使用率
		        	//http://ifeve.com/stampedlock-bug-cpu/
		            long lockr = lock.readLock();
		            System.out.println(Thread.currentThread().getName() + " get read lock");
		            lock.unlockRead(lockr);


		        }
		    }
}
