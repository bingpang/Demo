package com.test;

import java.util.Arrays;
import java.util.Random;
import java.util.regex.Pattern;

public class Test1 {

	public static void main(String[] args) {
		
//		for (int i = 1; i > 0; i++) {
//			if(i % 2 == 1 && i % 3 == 0 && i % 4 == 1 && ((i+1) % 5) == 0 && i % 6 == 3 && i % 7 == 0 && i % 8 == 1 && i % 9 == 0){
//				System.out.println(i);
//			}
//		}
//		String s= null;
//		System.out.print(s);
//		Integer i = null;
//		System.out.print(i);
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(isInteger("21474836423238"));
//		Integer [] nums = {8,3,5,2,7};
//		
//		Arrays.sort(nums);
//		
//		for(int i=nums.length-1;i>-1;i--){
//			System.out.println(nums[i]);
//		}
		
		
//		System.out.println(Integer.toOctalString(15));
//		System.out.println(Integer.toHexString(62));
//		System.out.println("2-"+Integer.toBinaryString(2));
//		System.out.println("3-"+Integer.toBinaryString(3));
//		System.out.println("4-"+Integer.toBinaryString(4));
//		System.out.println("5-"+Integer.toBinaryString(5));
//		System.out.println("6-"+Integer.toBinaryString(6));
//		System.out.println("7-"+Integer.toBinaryString(7));
//		System.out.println("8-"+Integer.toBinaryString(8));
//		System.out.println("9-"+Integer.toBinaryString(9));
//		System.out.println("10-"+Integer.toBinaryString(10));
//		System.out.println("11-"+Integer.toBinaryString(11));
//		System.out.println("12-"+Integer.toBinaryString(12));
//		System.out.println("255-"+Integer.toBinaryString(255));
//		int n=5;
//		n >>= 1;
//		System.out.println(n);
		
//		bucketSort();
//		consoleInfo(5);
		
	}
	
	private static void consoleInfo(int a){
		assert a > 0;
		System.out.println(a);
	}
	
	
	public static void bucketSort(){
		Long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		int []a = new int[100000];
		for(int i=0;i<a.length;i++){
			a[i] = 0;
		}
		for(int j=1;j<=100000;j++)
	    {
			Random ran = new Random();
			int t = ran.nextInt(200);
			System.out.print(t+",");
	        a[t]++;  //进行计数
	    }
		System.out.println("");
		for(int k=0;k<a.length;k++){
			if(a[k]!=0){
				for(int z=0;z<a[k];z++){
					System.out.print(k+",");
				}
			}
		}
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		System.out.println("");
		Long endTime = System.currentTimeMillis();
		System.out.println(endTime);
		System.out.println("");
//		System.out.println((endTime-startTime)/1000 + "s");
		
	}
	
	public static void test1(){
		System.out.println("test1");
	}
	public void test2(){
		System.out.println("test2");
	}
	
	public static boolean isInteger(String str) {  
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");  
        return pattern.matcher(str).matches();  
	}
}
