package com.sac;

public class Solution {

    public String longestCommonPrefix(String[] strs) {

        if(strs.length == 0){
            return "";
        }

        String prefix = strs[0];

        for(int i = 1; i < strs.length; i++){
            while (strs[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        Solution solution = new Solution();
        String prefix = solution.longestCommonPrefix(str);
        System.out.println("String with prefix: " + prefix);

    }
}
