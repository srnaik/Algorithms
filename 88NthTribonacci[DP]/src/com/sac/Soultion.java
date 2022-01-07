package com.sac;

public class Soultion {


    public int tribonacci(int n){

        if(n < 3) {
            return n == 0 ? 0 : 1;
        }

        int tmp = 0, x = 0, y = 1, z = 1;

        for(int i = 3; i <= n; i++){

            tmp = x+y+z;
            x = y;
            y = z;
            z = tmp;
        }
        return tmp;
    }


    public static void main(String[] args) {
        Soultion soultion = new Soultion();
        int n = soultion.tribonacci(25);
        System.out.println("Tribonacci of a given number: " + n);
    }
}
