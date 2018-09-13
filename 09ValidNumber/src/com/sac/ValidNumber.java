package com.sac;

public class ValidNumber {

    public boolean isNumber(String s){

        boolean isNumber = false;
        s = s.trim();
        int i = 0, n = s.length(), sign = 1;

        if(i < n && s.charAt(i) == '+'){
            i++;
        }else if(i < n && s.charAt(i) == '-'){
            i++;
            sign = -1;
        }
        while (i < n && Character.isDigit(s.charAt(i))){
            i++;
            isNumber = true;
        }

        if(i < n && s.charAt(i) == '.'){
            i++;
            while(i < n && Character.isDigit(s.charAt(i))){
                i++;
                isNumber = true;
            }
        }

        //Handle Character e
        if(isNumber && i < n && s.charAt(i) == 'e'){
            i++;
            isNumber = false;
            if(i < n && s.charAt(i)== '+' || s.charAt(i) == '-')
                i++;
            while (i < n && Character.isDigit(s.charAt(i))){
                i++;
                isNumber = true;
            }
        }
        while (i < n && Character.isWhitespace(s.charAt(i)))
            i++;
        return isNumber && i == n;
    }


    public static void main(String[] args) {
        ValidNumber validNumber = new ValidNumber();
        boolean isNumber = validNumber.isNumber("e9");
        if(isNumber)
            System.out.println("Given String is a valid number");
        else
            System.out.println("Given String is not a valid number");
    }
}
