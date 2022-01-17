package test;

import oca.A;

public class B extends A{
    public void print() {
        A obj = new A();
        System.out.println(obj.i1); //Line 8
        //System.out.println(obj.i2); //Line 9
        System.out.println(this.i2); //Line 10
        System.out.println(super.i2); //Line 11
    }
}
