package com.sac;

import java.io.IOException;

public class Factorial {


    private int factorial(int n) {
        try {
            if (n == 1)
                return 1;
        }catch(Exception e){
            e.printStackTrace();
        }
        return n * factorial(n-1);
    }

    public static void main(String[] args)  {
        Factorial factorial = new Factorial();
        System.out.println("Factorial of 4 is: "+ factorial.factorial(4));
    }
}
