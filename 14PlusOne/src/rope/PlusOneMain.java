package rope;

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
            int digit =  digits.get(i);
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


    public int[] plusOneTwo(int[] digits){

        if(digits == null || digits.length == 0)
            return null;

        int carry = 0;
        List<Integer> arList = new ArrayList<>();
        for(int i : digits){
            arList.add(i);
        }

        for(int j = arList.size()-1; j >= 0; j--){
            int num = arList.get(j);
            if(num < 9 && num + carry <= 9){
                arList.set(j,num+1);
                carry--;
                break;
            }else{
                arList.set(j,0);
                carry = 1;
            }
        }

        if(carry > 0)
            arList.add(0,carry);

       return arList.stream().mapToInt(i->i).toArray();

    }


    public static void main(String[] args) {

        List<Integer> arList = new ArrayList<>();
        arList.add(1);
        arList.add(9);
        int[] items = {7,9,9};
        PlusOneMain plusOneMain = new PlusOneMain();
       /* int[] results =  plusOneMain.plusOne(items);
        for(int i = 0; i < results.length; i++){
            Integer integer = (Integer) results[i];
            System.out.println(integer);
        }*/
       items = plusOneMain.plusOneAgain(items);
        for (int i = 0; i < items.length; i++)
            System.out.println(items[i]);
    }


    public int[] plusOneAgain(int[] items){

        if(items == null || items.length == 0)
            return null;

        List<Integer> arList = new ArrayList<>();
        int carry = 0;

        for (int x: items) {
            arList.add(x);
        }

        for(int i = arList.size()-1; i >= 0; i--){

            int digit = arList.get(i);

            if(digit < 9 && digit + carry <= 9){
                arList.set(i,digit+1);
                carry--;
                break;
            }else {
                arList.set(i,0);
                carry = 1;
            }

        }

        if (carry > 0)
            arList.add(0,carry);

        int[] result = new int[arList.size()];
        for(int j = 0; j < arList.size(); j++){
            result[j] = arList.get(j);
        }
        return result;
    }
}
