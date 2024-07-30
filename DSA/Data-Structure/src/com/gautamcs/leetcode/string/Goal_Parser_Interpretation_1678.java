package com.gautamcs.leetcode.string;

// https://leetcode.com/problems/goal-parser-interpretation/description/
public class Goal_Parser_Interpretation_1678 {
    public static void main(String[] args) {

        String command = "(al)G(al)()()G";

        char[] str = command.toCharArray();
        String temp = "";
        int len = str.length;
        for(int i = 0; i < len; i++) {
            if(str[i] == 'G') {
                temp = temp + 'G';
            } else if(str[i] == '(' && str[i+1] == ')') {
                temp = temp + 'o';
                i++;
            } else if(str[i] == '(' && str[i+1] == 'a') {
                temp = temp + "al";
                i = i + 2;
            }
        }

        System.out.println(" New Command: "+temp);
    }
}
