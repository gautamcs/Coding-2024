package com.gautamcs.leetcode.array;

import java.util.Arrays;

public class ArrayConcatenation1929 {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        System.out.println(" Original Array: "+ Arrays.toString(nums));
        int[] ans = new int[(nums.length )*2];
        int len = nums.length ;
        for(int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i+len] = nums[i];
        }
        System.out.println(" New Array: "+ Arrays.toString(ans));
    }
}
