package chap03;

import java.time.*;

public class DateTimeDemo {


    public void displayDateTime(){
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

    }

    public void createDate(){
        LocalDate localDate = LocalDate.of(2018, Month.APRIL,30);
        localDate = localDate.plusDays(10);
        System.out.println("Created Date: - " + localDate);
        Period period = Period.of(2020,1,10);
        period = period.ofYears(1);

        LocalTime localTime = LocalTime.of(10,10);
        System.out.println(localDate.getMonth());
    }



    public static void main(String[] args) {
        DateTimeDemo dateTimeDemo = new DateTimeDemo();
        dateTimeDemo.displayDateTime();
        dateTimeDemo.createDate();
    }
}
