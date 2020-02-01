package rope;

import java.util.Scanner;

public class StringPalindrome {

    public boolean isPalindrome(String str){

        if(str == null || str.isEmpty())
            return false;
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString().equalsIgnoreCase(str) ? true : false;
    }

    public boolean isPalindrome(int number){

        return false;
    }

    private void isNotPalindrome(){
        System.out.println("The entered input is not a palindrome");
    }

    private void isAPalindrome(){
        System.out.println("The entered input is a palindrome");
    }

    private boolean checkForPalindrome(String str){
        if(str == null)
            return false;
        int i = 0, j = str.length()-1;
        while (i < j){
            while (i < j && !Character.isLetterOrDigit(str.charAt(i)))
                i++;
            while (i < j && !Character.isLetterOrDigit(str.charAt(j)))
                j--;
            if(Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j)))
                return false;
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
        if(userInput.equalsIgnoreCase("1")) {
            System.out.println("Enter String Value");
            userInput =  scanner.nextLine();
            if(stringPalindrome.checkForPalindrome(userInput))
                stringPalindrome.isAPalindrome();
            else
               stringPalindrome.isNotPalindrome();
        }

    }
}
