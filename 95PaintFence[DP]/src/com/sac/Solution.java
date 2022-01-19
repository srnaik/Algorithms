package com.sac;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private Map<Integer, Integer> memo = new HashMap<>();

    public int numWays(int n, int k) {
        return totalWays(n, k);
    }

    private int totalWays(int i, int k) {

        if (i == 1) return k;
        if (i == 2) return k * k;

        if (memo.containsKey(i)) {
            return memo.get(i);
        }

        memo.put(i, (k - 1) * (totalWays(i - 1, k) + totalWays(i - 2, k)));
        return memo.get(i);

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int totalWays = solution.numWays(7, 2);
        System.out.println("Total ways : " + totalWays);
    }
}
