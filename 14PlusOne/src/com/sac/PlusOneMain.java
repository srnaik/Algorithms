package com.sac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOneMain {

    public void plusOne(List<Integer> digits){

        for(int i = digits.size()-1; i>= 0; i--){
            int digit = digits.get(i);
            if(digit < 9){
                digits.set(i,digit+1);
                return;
            }else{
                digits.set(i,0);
            }
        }
        digits.add(0);
        digits.set(0,1);
    }


    public int[] plusOne(int[] arrayItems){

        List<Integer> digits = new ArrayList<>();
        for (int i : arrayItems) {
            digits.add(i);
        }
        for(int i = digits.size()-1; i>= 0; i--){
            int digit = (Integer) digits.get(i);
            if(digit < 9){
                digits.set(i,digit+1);
                break;
            }else{
                digits.set(i,0);
            }
        }
        digits.add(0);
        digits.set(0,1);

        int[] result = new int[digits.size()];
        for(int i = 0; i < digits.size()-1 ; i++){
            result[i] = (int)digits.get(i);
        }
        return result;
       // return digits.toArray();
    }


    public static void main(String[] args) {

        List<Integer> arList = new ArrayList<>();
        arList.add(1);
        arList.add(9);
        int[] items = {1,9};
        PlusOneMain plusOneMain = new PlusOneMain();
        int[] results = plusOneMain.plusOne(items);
        for (int i : results) {
            System.out.println("Result Array : " + results[i]);
        }

    }
}
