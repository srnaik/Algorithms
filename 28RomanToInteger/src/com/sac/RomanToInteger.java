package com.sac;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    private Map<Character,Integer> map = new HashMap<>(){{
        put('I',1);
        put('V',5);
        put('X',10);
        put('L',50);
        put('C',100);
        put('D',500);
        put('M',1000);
    }};


    public int romanToInteger(String s){
        int total = 0, prev = 0;
        for (Character c: s.toCharArray()) {
            int curr = map.get(c);
            total += (curr > prev) ? (curr - 2 *prev) :curr;
            prev = curr;
        }
        return total;
    }

    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        int result = romanToInteger.romanToInteger("MCDXXXI");
        System.out.println("Result of conversion is: " + result);
    }
}
