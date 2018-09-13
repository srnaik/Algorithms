package com.sac;

import java.util.Scanner;

public class PalindromeImpl {


    public boolean isPalindrome(int number){

        if(number < 0)
            return false;
        int original = number, reverse = 0;
        while(original != 0){
            reverse = reverse *10 + original%10;
            original /= 10;
        }
        return (number == reverse) ? true : false;
    }

    public static void main(String[] args) {
        PalindromeImpl palindrome = new PalindromeImpl();
        System.out.println("Enter an Integer number");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        boolean isPalindrome = palindrome.isPalindrome(number);
        if(isPalindrome)
            System.out.println("The given number is palindrome");
        else
            System.out.println("The given number is not a palindrome");
    }
}
