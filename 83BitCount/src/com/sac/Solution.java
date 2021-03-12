package com.sac;

public class Solution {

    public int hammingWeight(int n) {
        return Integer.bitCount(n);
    }

    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    /**
     * Input: n = 00000010100101000001111010011100
     * Output:    964176192 (00111001011110000010100101000000)
     * Explanation: The input binary string 00000010100101000001111010011100 represents the unsigned integer 43261596,
     * so return 964176192 which its binary representation is 00111001011110000010100101000000.
     *
     * @param n
     * @return
     */
    public int reverseBits(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            ans <<= 1;
            ans = ans | (n & 1);
            n >>= 1;
        }
        return ans;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.hammingWeight(1111111101);
        System.out.println("Bit Count/Hamming Weight: " + result);
        int hammingDistance = solution.hammingDistance(1, 4);
        System.out.println("Hamming Distance:" + hammingDistance);
        int reverseBits = 10101010;
        int answer = solution.reverseBits(reverseBits);
        System.out.println("Reverse Bits: " + answer);

    }
}
