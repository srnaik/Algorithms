package chap05;

import java.util.function.Predicate;

public class Wolf extends Canine{

    public  static boolean isBiped(){
        return false;
    }
    public int getAverageWeight() {
        isBiped();
        return super.getAverageWeight() + 20;
    }

    public static void main(String[] args) {
        System.out.println(test( (i) -> {return i== 5;}));
    }

    private static boolean test(Predicate<Integer> p){

        return p.test(5);
    }

}
