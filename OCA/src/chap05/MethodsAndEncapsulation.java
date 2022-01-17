package chap05;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;

import static java.util.Arrays.asList;

public  class MethodsAndEncapsulation {

    synchronized public void walk7(){

        long num = 9L;
    }

    public void varargExample(int...nums){
        System.out.println(nums.length);
    }

    private static void add(double d1, double d2) {
        System.out.println("double version: " + (d1 + d2));
    }

    private static void add(Double d1, Double d2) {
        System.out.println("Double version: " + (d1 + d2));
    }

    private static void m1() throws Exception {
        throw new RuntimeException();
    }

    private static boolean flag = !true;

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2012, 1, 11);
        Period period = Period.of(1,2,1).ofYears(2).ofMonths(2);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yy");
        System.out.print(formatter.format(date.minus(period)));
    }

    private static void processStringArray(String [] arr,
                                           Predicate<String> predicate) {
        for(String str : arr) {
            if(predicate.test(str)) {
                System.out.println(str);
            }
        }
    }


    static class Point {
         int x;
        int y;
    }

}
