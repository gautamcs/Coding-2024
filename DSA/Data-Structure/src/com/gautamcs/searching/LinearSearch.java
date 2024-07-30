package com.gautamcs.searching;

import java.util.Arrays;

public class LinearSearch {
    private static int searchRegular(int[] arr, int key) {
        for(int i = 0; i < arr.length; i++) {
            if(key == arr[i]) {
                System.out.println(" Item found at Index: "+i);
                return i;
            }
        }
        return -1;
    }

    private static int searchRecursion(int[] arr, int key, int size) {
        size = size - 1;
        if(size < 0)
            return -1;
        else if(arr[size] == key) {
            return size;
        } else
        return searchRecursion(arr, key, size);
    }
    public static void main(String[] args) {
        int[] arr = {8,5,7,3,2};

        System.out.println(" Original Array: "+ Arrays.toString(arr));
        //int index = searchRegular(arr, 9);
        int index = searchRecursion(arr, 3, arr.length);
        System.out.println(" Index Found at: "+index);
    }
}
