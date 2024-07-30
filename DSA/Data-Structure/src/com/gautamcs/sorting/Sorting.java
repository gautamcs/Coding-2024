package com.gautamcs.sorting;

import java.util.Arrays;

public class Sorting {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for(int i = 1; i < n; i++) {
            int j = i-1;
            int key = arr[i];
            while(j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static void selectionSort(int[] arr) {
        int len = arr.length;
        for(int i = 0; i < len-1; i++) {
            int min = i;
            int j;
            for(j = i+1; j < len; j++) {
                if(arr[j] < arr[min])
                    min = j;
            }
            if(min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }

    public static void bubbleSort(int[] arr) {
        int len = arr.length;
        for(int i = 0; i < len; i++) {
            boolean flag = true ;
            for(int j = 0; j < len -1 - i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if(flag)
                break;
        }
    }
    public static void main(String[] args) {
        System.out.println(" Insertion Sort Program !");
        int[] arr = {8,5,7,3,2};

        System.out.println(" Original Array: "+ Arrays.toString(arr));
        //Sorting.insertionSort(arr);

        //selectionSort(arr);

        bubbleSort(arr);
        System.out.println(" Sorted Array: "+ Arrays.toString(arr));
    }
}
