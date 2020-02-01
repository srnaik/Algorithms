package com.sac;

public class PrimeNumber {

    public boolean isPrime(int num) {
        for (int i = 2; i < num/2; i++) {
            if (num % i == 0) {
                System.out.println(num + " is not prime");
                return false;
            }
        }
        System.out.println(num + " is prime");
        return true;
    }

    public int longestPrime(int num) {

        int a = num-1, i = 2;
        while (i < a/2) {
            if (a % i == 0) {
                 a--;
                 i = 1;
            }
            i++;
        }
        return (a < num &&  a > 1)  ? a : -1;
    }

        public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        //primeNumber.isPrime(9);
        System.out.println("Largest prime number is " + primeNumber.longestPrime(19));
    }

}
