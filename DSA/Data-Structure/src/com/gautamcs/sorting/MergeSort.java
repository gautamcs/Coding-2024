package com.gautamcs.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void divide(int[] arr, int s, int e) {
        if(s < e) {
            int mid = s + (e - s) / 2;
            divide(arr, s, mid);
            divide(arr, mid + 1, e);
            merger(arr, s, mid, e);

        }
    }

    private static void merger(int[] arr, int s, int mid, int e) {
        int i = s;
        int j = mid + 1;
        int k = 0;
        int[] temp = new int[e - s + 1];

        while (i <= mid && j <= e) {
            if(arr[i] < arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }

        while(i <= mid)
            temp[k++] = arr[i++];

        while(j <= e)
            temp[k++] = arr[j++];

        for(int a = 0, b = s; a < temp.length; a++, b++) {
            arr[b] = temp[a];
        }
    }

    public static void main(String[] args) {
        System.out.println(" Merge Sort Program !");
        int[] arr = {8,5,7,3,2};

        System.out.println(" Original Array: "+ Arrays.toString(arr));

        divide(arr, 0, arr.length-1);

        System.out.println(" Sorted Array: "+ Arrays.toString(arr));



    }
}
