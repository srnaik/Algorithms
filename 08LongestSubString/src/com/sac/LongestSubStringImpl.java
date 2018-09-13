package com.sac;

import java.util.HashSet;

public class LongestSubStringImpl {

    public int getLongestSubStr(String str){
        int maxLength = 0;
        HashSet<Character> hsSet = new HashSet<>();
        int i = 0, j = 0;
        while ( j < str.length()){
            if(!hsSet.contains(str.charAt(j))){
                hsSet.add(str.charAt(j));
                j++;
                maxLength = Integer.max(maxLength,j-i);
            }else{
                hsSet.remove(str.charAt(i));
                i++;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {

        LongestSubStringImpl impl = new LongestSubStringImpl();
        int maxCount = impl.getLongestSubStr("abcabcbb");
        System.out.println("Longest subString is : " + maxCount);
    }
}
