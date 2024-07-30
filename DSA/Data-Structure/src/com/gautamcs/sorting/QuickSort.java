package com.gautamcs.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void sort(int[] arr, int s, int e) {
        if(s > e)
            return;
        {
            int pi = partition(arr, s, e);
            sort(arr, s, pi-1);
            sort(arr, pi+1, e);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private static int partition(int[] arr, int s, int e) {
        int pi = arr[e];
        int i = s-1;
        for(int j = s; j < e; j++) {
            if(arr[j] < pi) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, e);
        System.out.println("Partition Index: "+(i+1));
        System.out.println(" Array: "+Arrays.toString(arr));
        return i+1;
    }

    public static void main(String[] args) {
        System.out.println(" Quick Sort Program !");
        int[] arr = {8,5,7,3,2};
        System.out.println(" Original Array: "+ Arrays.toString(arr));

        sort(arr, 0, arr.length-1);
        System.out.println(" Sorted Array: "+ Arrays.toString(arr));
    }
}
