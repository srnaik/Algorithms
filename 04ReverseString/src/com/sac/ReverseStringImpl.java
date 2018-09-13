package com.sac;

import java.util.Scanner;

public class ReverseStringImpl {

    /**
     * O(n) time, O(n) space - Where n is the number of words in a String.
     * @param str
     * @return
     */
    public String reverseString(String str){
        if(str == null || str.length() == 0)
            return " ";
        String[] strArray = str.split(" ");
        StringBuilder builder = new StringBuilder();
        for(int i = strArray.length -1; i >= 0; i--){
            if(!strArray[i].equals(" ")){
                builder.append(strArray[i]).append(" ");
            }
        }
        return builder.length() ==0 ? " " : builder.substring(0, builder.length()-1);
    }


    public static void main(String[] args) {
        ReverseStringImpl impl = new ReverseStringImpl();
        System.out.println("Enter the string that is to reversed:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String str = impl.reverseString(input);
        System.out.println("Reversed String is: " + str);
    }
}
