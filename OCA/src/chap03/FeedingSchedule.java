package chap03;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class FeedingSchedule {

    private static void m(int x) {
        System.out.println("int version");
    }

    private static void m(char x) {
        System.out.println("char version");
    }

    public static void main(String[] args) {
        int [] arr = {2, 1, 0};
        for(int i : arr) {
            System.out.println(arr[i]);
        }
    }

    private static void processStringArray(String [] arr,
                                           Predicate<String> predicate) {
        for(String str : arr) {
            if(predicate.test(str)) {
                System.out.println(str);
            }
        }
    }

    private static boolean checkAndIncrement(int x) {
        if(x < 5) {
            x++;
            return true;
        } else {
            return false;
        }
    }

    private static void m1() throws Exception { //Line 6
        System.out.println("NOT THROWING ANY EXCEPTION"); //Line 7
    }
}
