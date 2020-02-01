package rope;

import java.util.Scanner;

public class PalindromeImpl {


    public boolean reverse(int number){

        if(number < 0) {
            return false;
        }

        int original = number, reverse = 0;

        while(original > 0){
            reverse = reverse *10 + original%10;
            original /= 10;
        }
        return (number == reverse) ? true : false;
    }

    public boolean isPalindrome(int number){

        if(number< 0){
            return false;
        }

        int div = 1;

        while(number/div>=10){
            div*= 10;
        }

        while(number != 0){

            int left = number/div;
            int right = number%10;

            if(left!= right){
                return false;
            }

            number = (number%div)/10;
            div/=100;
        }

        return true;
    }




    public static void main(String[] args) {

        PalindromeImpl palindrome = new PalindromeImpl();
        System.out.println("Enter an Integer number");

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        boolean isPalindrome = palindrome.isPalindrome(number);

        if(isPalindrome) {
            System.out.println("The given number is palindrome");
        }
        else {
            System.out.println("The given number is not a palindrome");
        }

    }

}
