package com.gautamcs.leetcode.array;

import java.util.Arrays;

public class RunningSum1480 {
    private static int sum(int[] arr, int i) {
        int sum = 0;
        if(i > arr.length) {
            return sum;
        }
        for(int j = 0; j <= i; j++) {
            sum = sum + arr[j];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] num = {1,3,2,4};
        System.out.println(" Original Array: "+ Arrays.toString(num));
        int[] temp = new int[num.length];

        for(int i = 0; i < num.length; i++) {
            temp[i] = sum(num, i);
        }

        System.out.println(" New Array: "+ Arrays.toString(temp));
    }
}
