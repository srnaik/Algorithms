import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Queue {

    private int top = -1, rear = -1;
    private int[] items = new int[100];


    public boolean add(int item){

        if(rear >= items.length-1){
            System.out.println("Queue is Full");
            return false;
        }

        items[++rear] = item;
        if(top < 0){
            top = rear;
        }
        return true;
    }

    public void trimToSize(){

    }

    public int pop(){

        if( top < 0 || top > items.length -1){
            System.out.println("Queue is Empty");
            return Integer.MIN_VALUE;
        }

        return items[top++];
    }

    public void display(){

        if(top < 0 || top > items.length-1){
            System.out.println("Queue is Empty");
            return;
        }

        int index = top;

        while (index <= rear){
            System.out.print(items[index++]);
            System.out.print((index < rear) ? "," :".");
        }
    }

    public boolean isEmpty(){
        return (top > rear);
    }

    public int peek(){

        if( top < 0 || top > items.length-1){
            System.out.println("Queue is Empty");
            return Integer.MIN_VALUE;
        }

        return items[top];
    }
}
