package com.sac;

import java.util.Stack;

public class Solution {

    public int[] dailyTempratures(int[] temperatures) {

        int n = temperatures.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int currDay = 0; currDay < n; currDay++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[currDay]) {
                int prevDay = stack.pop();
                answer[prevDay] = currDay - prevDay;
            }
            stack.push(currDay);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        Solution solution = new Solution();
        temperatures = solution.dailyTempratures(temperatures);
        System.out.print("Daily temperature details: ");
        for (int temperature : temperatures) {
            System.out.print(temperature + "\t");
        }

    }
}
