package com.sac;

public class Solution {
    int[][] memo;
    String text1, text2;

    public int longestCommonSubsequence(String text1, String text2) {

        memo = new int[text1.length()+1][text2.length()+1];

        for(int i = 0; i < text1.length(); i++){
            for( int j = 0; j < text2.length(); j++){
                memo[i][j] = -1;
            }
        }
        this.text1 = text1;
        this.text2 = text2;
        return memo(0,0);

    }

    private int memo(int p1, int p2){

        if(memo[p1][p2] != -1){
            return memo[p1][p2];
        }

        int answer = 0;

        if(text1.charAt(p1) == text2.charAt(p2)){
            answer = 1 + memo(1+p1, 1+p2);
        }else{
            answer = Math.max(memo(p1, p2+1), memo(p1+1, p2));
        }

        memo[p1][p2] = answer;
        return memo[p1][p2];
    }
}
