package chap05.inheritance;

import chap05.Wolf;

public class WolfChild extends Wolf{

    public int display(){
        System.out.println(isBiped());
        return super.getAverageWeight();
    }

    public static boolean isBiped(){
        return true;
    }
    public static void main(String[] args) {
        WolfChild wolfChild  = new WolfChild();
        System.out.println(wolfChild.display());

    }
}
