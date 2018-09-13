package com.sac;

import java.util.ArrayList;
import java.util.List;

public class LongestSubStringWithTwoDistinct {

    public int lengthOfSubStringWithTwoDistinct(String s) {

        long x = 10;
        long y = 2 * x;

        int[] count = new int[256];
        int i = 0, numDistinct = 0, maxLen = 0;
        for (int j = 0; j < s.length(); j++) {
            if (count[s.charAt(j)] == 0) numDistinct++;
            count[s.charAt(j)]++;
            while (numDistinct > 2) {
                count[s.charAt(i)]--;
                if (count[s.charAt(i)] == 0) numDistinct--;
                i++;
            }
            maxLen = Math.max(j - i + 1, maxLen);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        LongestSubStringWithTwoDistinct ls = new LongestSubStringWithTwoDistinct();
        int length = ls.lengthOfSubStringWithTwoDistinct("eceeba");
        System.out.println("Longest SubString Length is: " + length);
        int x1 = 50, x2 = 75;
        boolean b = x1 > x2;
        if(b = true) System.out.println("Success");
        else System.out.println("Failure");

        long x = 10;
        int y = 5;

    }
}
