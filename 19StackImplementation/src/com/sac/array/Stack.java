package com.sac.array;

public class Stack {

    private int top = -1;
    private int[] arrayItems = new int[100];

    public boolean push(int item){
        if(top == arrayItems.length -1)
            return false;
        arrayItems[++top] = item;
        return true;
    }

    public int pop(){
        if (top == -1)
            return Integer.MIN_VALUE;
        return arrayItems[top--];
    }

    public int peek(){
        if(top == -1)
            return Integer.MIN_VALUE;
        return arrayItems[top];
    }

    public boolean isEmpty(){
        return (top < 0);
    }

    public void displayItems(){
        if (top == -1)
            return;
        int index = top;
        while (index >= 0){
            System.out.print(arrayItems[index-- ]);
            System.out.print((index >= 0) ? "," : ".");
        }
    }
}
