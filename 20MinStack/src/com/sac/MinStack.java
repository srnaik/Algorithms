package com.sac;

import java.util.Stack;

public class MinStack {

    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public void push(int item){
        stack.push(item);
        if(minStack.isEmpty() || item <= minStack.peek())
            minStack.push(item);
    }


    public void pop(){
        if(stack.pop().equals(minStack.peek()))
                minStack.pop();
    }

    public int top(){
        return stack.peek();
    }

    public int getMin(){
        return minStack.peek();
    }
}
