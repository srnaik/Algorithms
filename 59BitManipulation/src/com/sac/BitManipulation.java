package com.sac;

public class BitManipulation {

    public int singleNumber(int[] num){

        int ret = 0;

        for (int i : num) {
            ret ^= i;
        }
        return ret;
    }


    public static void main(String[] args) {

        int[] num = {-1,-1};

        BitManipulation bitManipulation = new BitManipulation();
        int ret = bitManipulation.singleNumber(num);
        System.out.println(ret);
    }
}
