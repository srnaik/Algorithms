package com.sac;

public class Solution {


    /**
     * Approach: Sieve of Eratosthenes (LeetCode 204)
     *
     * Step 1 : Assume all numbers below n are prime.
     * Step 2: Generate and eliminate composite numbers.
     * Step 3: Count remaining primes.
     *
     * @param n
     * @return
     */
    private int countPrime(int n) {

        int count = 0;
        boolean primes[] = new boolean[n + 1];

        for (int i = 2; i < primes.length; i++) {
            primes[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (primes[i]) {
                for (int j = i * i; j <= n; j += i) {
                    primes[j] = false;
                }
            }
        }

        for (int i = 2; i < n; i++) {
            if (primes[i]) {
                count++;
            }
        }

        return count;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int count1 = solution.countPrime(10);
        System.out.println("Total prime numbers below 10 are: " + count1);
        int count2 = solution.countPrime(20);
        System.out.println("Total prime numbers below 20 are: " + count2);
    }
}
