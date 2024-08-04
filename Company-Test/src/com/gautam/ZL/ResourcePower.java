package com.gautam.ZL;

import java.util.Arrays;

public class ResourcePower {
	public  static int[] getPower(int p) {
		int pow = 0; 
		int temp = 0;
		if(p >= 3) {
			pow = Math.floorDiv(p, 3);
		} else if(p >= 1) {
			temp = Math.floorDiv(p, 1);
			//System.out.println(" Temp: "+temp);
		}
		
		if(p%3 >= 1) {
			temp = Math.floorDiv(pow, 1);
			//System.out.println(" Temp: "+temp);
		}
		int[] arr = {pow, temp};
		return arr;
	}
	public static void main(String args[]) {
		
		int a = 0; 
		int b = 3; 
		int c = 6; 
		
		int sum = 0; 
		int[] sumA = ResourcePower.getPower(a);
		int[] sumB = ResourcePower.getPower(b);
		int[] sumC = ResourcePower.getPower(c);
		
		sum = sumA[0] + sumB[0] + sumC[0]; 
		
		if(sumA[1] > 0 && sumB[1] > 0 && sumC[1] > 0) {
			sum += 1; 
		}
		
		System.out.println(" Total Sum: "+sum);
	
	}
}
