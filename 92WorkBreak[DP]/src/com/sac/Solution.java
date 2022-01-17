package com.sac;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {


    public boolean wordBreak(String s, List<String> wordDist){

        Set<String> wordDistSet = new HashSet<>(wordDist);
        boolean[] dp = new boolean[s.length()+1];
        dp[0]=true;

        for(int i = 1; i < s.length(); i++){
            for(int j = 0; j < i; j++){
                if(dp[j] && wordDistSet.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] s = {"leet","code"};
        boolean result = solution.wordBreak("leetcode",Arrays.asList(s));
        if(result){
            System.out.println("Sequence is present");
        }else {
            System.out.println("Sequence is not present");
        }
    }
}
