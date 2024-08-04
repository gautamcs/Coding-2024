package com.gautam.genaral;

import java.util.ArrayList;

public class ArrayTest {
	public static void main(String[] args) {
		
		ArrayList<Integer> list =  new ArrayList<>();
		
		for(int i= 0; i <= 20; i++) {
			list.add(i);
		}
		
		System.out.println(" Original Data: "+list);
		
		list.stream().filter(i -> i%2 == 0).skip(2).limit(1).forEach(i -> System.out.print(i+" "));
	}
}
