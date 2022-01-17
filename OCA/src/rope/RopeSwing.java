package rope;
import java.util.Arrays;
import java.util.Collections;

import  static java.util.Collections.sort;

public class RopeSwing {
    private static Rope rope1 = new Rope();
    private static Rope rope2 = new Rope();
    {
        System.out.println(rope1.length);
    }

    public static long square(int x){
        long y = x *(long)x;
        x = -1;
        return y;
    }

    public static StringBuilder work(StringBuilder a, StringBuilder b){
        a = new StringBuilder("a");
        b.append("b");
        return a;
    }

    public static void main(String[] args) {
     StringBuilder s1 = new StringBuilder("s1");
        StringBuilder s2 = new StringBuilder("s2");
        StringBuilder s3 = work(s1,s2);
        System.out.println("s1= " + s1);
        System.out.println("s2= " + s2);
        System.out.println("s3= " + s1);

    }
}
