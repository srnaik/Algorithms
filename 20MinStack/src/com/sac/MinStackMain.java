package com.sac;

public class MinStackMain {

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(10);
        minStack.push(18);
        minStack.push(8);
        minStack.push(99);
        System.out.println(minStack.getMin());
        minStack.pop();
        minStack.pop();
        System.out.println(minStack.getMin());


    }
}
