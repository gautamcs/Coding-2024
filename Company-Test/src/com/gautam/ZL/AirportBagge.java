package com.gautam.ZL;

import java.util.Arrays;

public class AirportBagge {
	
	public static int addArr(int[] arr) {
		int sum = Arrays.stream(arr).reduce(0, (a, b) -> a+b);
		return sum;
	}
	
	public static void main(String[] args) {
	
		int totalBag = 11; 
		int storage = 3; 
		
		int sum = 0; 
		int arr[] = new int[storage];
		int pass = 0;
		int count = 0; 
		while(totalBag >= 0) {
			//int sum = 0;
			for(int i = 0; i < arr.length &&  totalBag > 0; i++ ) {
				//if(za)
				arr[i] = arr[i] + (++count);
				totalBag = totalBag - (pass + (i+1));
				System.out.println(" Total Bag: "+totalBag+", "+Arrays.toString(arr));
			}
			pass++; 
		}
		
		System.out.println(" Original Array: "+Arrays.toString(arr));
		
	}
}
