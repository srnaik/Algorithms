package rope.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Stack {

    private int top = -1;
    private List<Integer> stackObj = new LinkedList<>();

    public void push(int item){
        stackObj.add(item);
        top++;
    }

    public int pop(){
        if(!stackObj.isEmpty()){
            int item = stackObj.get(top);
            stackObj.remove(top--);
            return item;
        }
        return Integer.MIN_VALUE;
    }

    public void displayItems(){
        if(!stackObj.isEmpty()){
            int index = top;
            while (index >= 0){
                System.out.print(stackObj.get(index--));
                System.out.print((index >= 0 ? "," : "."));
            }
        }
    }

    public boolean isEmpty(){
        return stackObj.isEmpty();
    }

}
