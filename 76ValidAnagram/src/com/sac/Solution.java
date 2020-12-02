package com.sac;

import java.util.Arrays;

public class Solution {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        return Arrays.equals(str1, str2);

    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        Solution solution = new Solution();
        boolean result = solution.isAnagram(s, t);

        if (result) {
            System.out.println("Given Strings are Anagrams");
        } else {
            System.out.println("Given Strings are not Anagrams");
        }
    }

}
