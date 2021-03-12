package com.sac;

public class Solution {

    public int hammingWeight(int n){
        return Integer.bitCount(n);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.hammingWeight(1111111101);
        System.out.println("Bit Count: " + result);
    }
}
