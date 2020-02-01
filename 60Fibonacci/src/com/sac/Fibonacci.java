package com.sac;

public class Fibonacci {



    public int getFibonacciSeries(int number){

        if( number <=1)
            return number;

        return getFibonacciSeries(number-1) + getFibonacciSeries(number-2);
    }


    public int[] allFib(int n){

        int[] memo = new int[n+1];
        allFib(n,memo);
        return memo;

    }

    private int allFib(int n, int[] memo){

        if(n <=1 )
            return n;
        else if(memo[n] > 0)
            return memo[n];
        memo[n] = allFib(n-1,memo) + allFib(n-2,memo);
        return memo[n];
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.getFibonacciSeries(6);
        System.out.println("Final Result is: "+ result);
    }


}
