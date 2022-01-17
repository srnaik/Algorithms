package kwarmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {

    private int age;
    private String firstName;
    private String lastName;

    public Student(int age, String firstName, String lastName){
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Student o) {

        if(this.age == o.age)
        return 0;
        else if(this.age > o.age)
            return 1;
        else return -1;

    }

    public static void main(String[] args) {

        Student stuOne = new Student(31,"Sachin","Naik");
        Student stuTwo = new Student(25,"Sadan","Naik");
        Student stuThree = new Student(28,"Rohit","Sharma");

        List<Student> list = new ArrayList<>();
        list.add(stuOne);
        list.add(stuTwo);
        list.add(stuThree);

        Collections.sort(list);

        list.forEach(x-> System.out.println(x.getFirstName()));
    }
}
