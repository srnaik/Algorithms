package com.sac;

import java.util.Objects;
import java.util.Scanner;

public class StringPalindrome {

    public boolean isPalindrome(String inputString) {

        if (Objects.isNull(inputString)) {
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder(inputString);
        return stringBuilder.reverse().toString().equalsIgnoreCase(inputString) ? true : false;
    }

    private void isNotPalindrome() {
        System.out.println("The entered input is not a palindrome");
    }

    private void isAPalindrome() {
        System.out.println("The entered input is a palindrome");
    }

    private boolean checkForPalindrome(String inputString) {

        if (Objects.isNull(inputString)) {
            return false;
        }

        int i = 0, j = inputString.length() - 1;

        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(inputString.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(inputString.charAt(j))) {
                j--;
            }
            if (Character.toLowerCase(inputString.charAt(i)) != Character.toLowerCase(inputString.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


    public static void main(String[] args) {

        System.out.println("Enter 1 for String input, 2 for integer input");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        StringPalindrome stringPalindrome = new StringPalindrome();

        if (userInput.equalsIgnoreCase("1")) {
            System.out.println("Enter String Value");
            userInput = scanner.nextLine();

            if (stringPalindrome.checkForPalindrome(userInput)) {
                stringPalindrome.isAPalindrome();
            } else {
                stringPalindrome.isNotPalindrome();
            }
        }

    }
}
