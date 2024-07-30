package com.gautamcs.sorting;

import java.util.Arrays;

public class CyclicSortEx {
    public static void  cyclicSort(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            int cp = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[cp]) {
                int temp = arr[i];
                arr[i] = arr[cp];
                arr[cp] = temp;
            } else {
                i++;
            }
        }
    }
    public static void main(String[] args) {

        int[] arr = {1,2,0,4};
        System.out.println(" Original Array: "+ Arrays.toString(arr));

        cyclicSort(arr);

        System.out.println(" Sorted Array: "+ Arrays.toString(arr));

    }
}
