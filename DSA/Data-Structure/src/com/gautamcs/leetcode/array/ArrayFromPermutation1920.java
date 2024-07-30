package com.gautamcs.leetcode.array;

import java.util.Arrays;

public class ArrayFromPermutation1920 {
    public static void main(String[] args) {

        int[] arr = {5,0,1,2,3,4};
        System.out.println(" Original Array: "+ Arrays.toString(arr));
        int[] temp = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            temp[i] = arr[arr[i]];
        }
        System.out.println(" Modified Array: "+ Arrays.toString(temp));
    }
}
