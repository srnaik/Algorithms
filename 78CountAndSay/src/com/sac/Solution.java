package com.sac;

public class Solution {

    public String countAndSay(int count){
        if(count == 1){
            return "1";
        }
        String answer = "1";

        for(int i = 2; i <= count; i++){
        answer = evaluate(answer);
        }
        return answer;
    }

    private String evaluate(String str){
        char ch = str.charAt(0);
        int count = 1;

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 1; i < str.length(); i++){
            if(ch != str.charAt(i)){
                stringBuilder.append(count).append(ch);
                ch = str.charAt(i);
                count = 1;
            }else{
                count++;
            }
        }
        stringBuilder.append(count).append(ch);
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String answer = solution.countAndSay(5);
        System.out.println("Answer is: " + answer);
    }


}
