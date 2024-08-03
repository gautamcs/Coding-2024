package com.gautamcs.searching;

import java.util.HashMap;

public class BinarySearch {
    public static int method1(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key)
                return mid;

            if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }

    public static int recMethod(int[] arr, int low, int high, int key) {
        int mid = low + (high - low) / 2;
        if (low <= high) {
            if (arr[mid] == key)
                return mid;

            if (arr[mid] < key)
                return recMethod(arr, mid + 1, high, key);
            else
                return recMethod(arr, low, mid - 1, key);
        }

        return -1;

    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 10, 40};
        int key = 11;

        HashMap<Integer, String> map = new HashMap<>(4);
        System.out.println("Size: "+map.size());

        //int index = BinarySearch.method1(arr, key);

//        Character.is
        int index = BinarySearch.recMethod(arr, 0, arr.length - 1, key);
        System.out.println(" Key Found at: " + index);
    }
}
