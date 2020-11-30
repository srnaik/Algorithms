package com.sac;

import java.util.Arrays;

public class Solution {

    public int heightChecker(int[] heights){
        int count = 0;
        int[] copy = Arrays.copyOf(heights,heights.length);
        Arrays.sort(copy);

        for(int i = 0; i < copy.length; i++){
            if(copy[i] != heights[i]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = {1,1,4,2,1,3};

        Solution solution = new Solution();
        int count = solution.heightChecker(array);
        System.out.println("Count: " + count);
    }
}
