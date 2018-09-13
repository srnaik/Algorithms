package com.sac.list;

public class StackImpl {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(2);
        stack.push(6);
        stack.push(4);
        stack.displayItems();
        System.out.println();
        System.out.println("Is Stack Empty? : " + stack.isEmpty());
        stack.pop();
        System.out.println("Stack Items After pop() operation");
        stack.displayItems();
    }
}
