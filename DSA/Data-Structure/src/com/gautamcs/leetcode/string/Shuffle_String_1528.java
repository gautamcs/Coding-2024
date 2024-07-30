package com.gautamcs.leetcode.string;

import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class Shuffle_String_1528 {
    public static void main(String[] args) {

        String str = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};

//        TreeMap<Integer, Integer> map = new TreeMap<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : indices) {
            map.put(indices[i], i);
        }
        System.out.println(map);
        String temp = "";
        for(int i = 0; i < indices.length; i++) {
            temp = temp + str.charAt(map.get(i));
        }

        System.out.println(" New String: "+temp);
    }
}
