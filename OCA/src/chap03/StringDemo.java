package chap03;

import java.nio.channels.Channel;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public  class StringDemo {

    private  static String s = "Hello";

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }


    public void arrayListDemo(){
        List list = new ArrayList();
        list.add("Hello");
        System.out.println(list);
        list.add(1,Boolean.TRUE);
        System.out.println(list);

        List<String> one = new ArrayList<>();
        List<String> two = new ArrayList<>();
        System.out.println(one.equals(two));
        one.add(0, "Hello");
        two.add("Hello");
        System.out.println(one.equals(two));
        two.add(0, "Hi");
        System.out.println(two.equals(one));
        try {
            long l = Integer.valueOf("1");
            System.out.println(l);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Hello");
    }

    public void roar(String roar1, StringBuilder roar2){
        roar1.concat("!!!");
        roar2.append("!!!");
    }
    public static void main(String[] args) {
       List<Integer> ages = new ArrayList<>();
      /* ages.add(Integer.parseInt("1"));
        ages.add(Integer.valueOf("6"));
        ages.add(7);
        ages.add(1);
        for (int age: ages) {
            System.out.println(age);
        }

        LocalDate localDate = LocalDate.of(2018, Month.APRIL,40);
        System.out.println(localDate.getYear() + "" + localDate.getMonth()+ "" + localDate.getDayOfMonth());
        Period p = Period.ofYears(1)*/

     for(int i = 0; i< 10;i++){
         i = i++;
         System.out.println("Hello World " + i);
     }

     int x1 = 50, x2 = 75, x3 = 0;
     x3 += x2+x3;
     boolean b = x1 >= x2;
     if(b = true)
         System.out.println("Success");
     else
         System.out.println("Failure");

     boolean keepGoing = true;
     int result = 15, i = 10;
     do{
       i--;
       if(i ==8)
           keepGoing=false;
       result -= 2;
     }while(keepGoing);
        System.out.println(result);

    }
}
