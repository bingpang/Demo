package com.test2;

public class ThreadTest  extends Thread{
	
	private String name;  
    public ThreadTest(String name) {  
       this.name=name;  
    }  
    
    public void run() {  
        for (int i = 0; i < 5; i++) {  
            System.out.println(name + "运行  :  " + i);  
            try { 
            	int time = (int) Math.random() * 10;
//            	System.out.println("sleep:"+ time);
                sleep(time);  
            } catch (InterruptedException e) {  
                e.printStackTrace();  
            }  
        }  
    } 
		
	public static void main(String[] args) {
//		ThreadTest mTh1=new ThreadTest("A");  
//		ThreadTest mTh2=new ThreadTest("B");  
//        mTh1.start();  
//        mTh2.start();  
	}
}
