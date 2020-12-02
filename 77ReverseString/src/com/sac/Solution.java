package com.sac;

import java.util.Arrays;

public class Solution {

    char[] cpyArray;

    public void reverseString(char[] s){
        helper(s,0,s.length-1);
        cpyArray = Arrays.copyOfRange(s,0,s.length);
    }

    private void helper(char[] s, int start, int end){

        if(start >= end){
            return;
        }

        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        helper(s,start+1,end-1);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.reverseString("Hello".toCharArray());

        for(char c: solution.cpyArray){
            System.out.print(c + "\t");
        }
    }

}
