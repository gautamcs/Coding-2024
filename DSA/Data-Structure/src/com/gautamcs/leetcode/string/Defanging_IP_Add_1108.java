package com.gautamcs.leetcode.string;

public class Defanging_IP_Add_1108 {
    public static void main(String[] args) {

        String ipAdd = "1.1.1.1";

        String temp = ipAdd.replace(".", "[.]");

        System.out.println(" New IP Address: "+temp);
    }
}
