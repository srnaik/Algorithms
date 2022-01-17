package my.city;


import my.school.ClassRoom;


public class School{

    int x;
    boolean call;
    public School(){
        this(2);
        call = false;

    }

    public School(int x){

    }
    public static long square(int x){
        long y = x *(long)x;
        x = -1;
        return y;
    }

    public static void main(String[] args) {
        int value = 9;
        long result = square(9);
        System.out.println(value);
    }
}
