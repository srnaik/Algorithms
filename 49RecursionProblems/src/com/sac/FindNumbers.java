package com.sac;

public class FindNumbers {


    private int countNumbers(int x, int n){
        if(x > n)
            return 0;
        return 1 + countNumbers(x*10,n) + countNumbers(x*10+1,n);
    }


    public static int gcdRecursion(int m, int n) {
        if (n == 0) return m;
        else return gcdRecursion(n, m % n);
    }

    public static void main(String[] args) {
        FindNumbers findNumbers = new FindNumbers();
        //System.out.println(findNumbers.countNumbers(1,15));
       int result = gcdRecursion(10,11);
        System.out.println("GCD is: " + result);
    }
}
