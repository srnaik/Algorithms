package chap03;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;

public class Test extends Object {

    class Base {

        public void m1() throws RuntimeException {
        }
    }

    interface ExceptionDemo{
        void test() throws RuntimeException;
    }

    class Derived extends Base implements ExceptionDemo{

        @Override
        public void m1() {
            System.out.println("Derived: m1()");
        }

        @Override
        public void test() {
            System.out.println("Hello");
        }
    }

    class Student {
        private String name;
        private int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String toString() {
            return "Student[" + name + ", " + age + "]";
        }


        public boolean equals(Student obj) {
            if(obj instanceof Student) {
                Student stud = (Student)obj;
                if(this.name.equals(stud.name) && this.age == stud.age) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("grape");
        fruits.add("mango");
        fruits.add("banana");
        fruits.add("grape");

        if(fruits.remove("grape"))
            fruits.remove("papaya");

        System.out.println(fruits);
    }

    public void test(){
        Base obj = new Derived();
        obj.m1();
        ExceptionDemo exception = new Derived();
        exception.test();
    }

}
