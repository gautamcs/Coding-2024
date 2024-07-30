package Arithmetic;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumber {
	
	static int[] generatePrime(int num) {
		int[] prime = new int[num];
		
		int i, j;
		int a = 0;
		boolean flag = false;
		for(i = 1; i <= num; i++) {
			if( num == 1 || num ==0)
				continue; 
			
			for(j = 2; j <= i/2; j++) {
				if(i % j == 0) {
					flag = true;
					break;
				}
			}
			if(flag) {
				
				//System.out.println(i+" ");
				prime[a++] = i;
				
			}
		}
		
		return prime;
	}
	
	public static void main(String[] args) {
		
		System.out.print(" Enter Numner: ");
		int num; 
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		System.out.println(" Your Number: "+num);
		
		int[] prime = PrimeNumber.generatePrime(num);
		
		Arrays.toString(prime);
	}

}
