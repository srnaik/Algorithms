package com.sac;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MyStack {

    private Queue<Integer> queue = new LinkedList<>();

    public MyStack(){

    }

    public void push(int x){
        queue.add(x);
        int size = queue.size();
        while (size > 1){
            queue.add(queue.remove());
            size--;
        }
    }

    public int pop(){
        return queue.remove();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public int peek(){
        return queue.peek();
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(10);
        myStack.push(20);
        System.out.println("Popped element : "+ myStack.pop());
        System.out.println("Peek element : "+ myStack.peek());
        System.out.println("Is Empty : "+ myStack.isEmpty());
        myStack.push(100);
        System.out.println("Element at peek : "+ myStack.peek());
    }
}
