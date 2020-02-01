package com.sac;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class GreaterElement {

    private Stack<Integer> stack = new Stack<>();
    private Map<Integer,Integer> hsMap = new HashMap<>();

    public int[] nextGreaterElement(int[] nums1, int[] nums2){

        for(int num: nums2){
            while (!stack.isEmpty() && stack.peek() < num){
                hsMap.put(stack.pop(),num);
            }
            stack.push(num);
        }

        int[] result = new int[nums1.length];

        for(int i = 0; i < nums1.length; i++){
            result[i] = hsMap.getOrDefault(nums1[i],-1);
        }

        return result;
    }

    public String removeDuplicates(String str){

        char[] items = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();


        for (char c: items) {
            if(!stack.isEmpty() && !stack.peek().equals(c)){
                stringBuilder.append(c);
            }else{
                stack.push(c);
            }



        }
        return stringBuilder.toString();
    }


    public static void main(String[] args) {
        GreaterElement greaterElement = new GreaterElement();
        int[]  nums1 = {2,4}, nums2 = {1,2,3,4};
        int[] result = greaterElement.nextGreaterElement(nums1,nums2);

        for (int num: result) {
            System.out.println("Final Result is: " + num);
        }

        System.out.println(greaterElement.removeDuplicates("abbaca"));


    }

}
