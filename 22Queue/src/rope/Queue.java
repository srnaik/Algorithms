package rope;

public class Queue {

    private int top = -1, rear = -1;
    private int[] queueItems = new int[100];

    public boolean add(int item){
        if(rear >= queueItems.length-1){
            System.out.println("Queue is full, Insertion not possible");
            return false;
        }else{
            queueItems[++rear] = item;
            if(top == -1)
                top= rear;
            return true;
        }
    }

    public int pop(){
        if(top < 0 || top > queueItems.length-1){
            System.out.println("Queue is Empty");
            return Integer.MIN_VALUE;
        }else {
            return queueItems[top++];
        }
    }

    public int peek(){
        if(top < 0 || top > queueItems.length-1){
            System.out.println("Queue is Empty");
            return Integer.MIN_VALUE;
        }else{
            return queueItems[top];
        }
    }

    public boolean isEmpty(){
        return top > rear;
    }

    public void display(){
        if( top < 0 || top > queueItems.length-1){
            System.out.println("Queue is Empty");
            return;
        }else{
            int index = top;
            while (index <= rear){
                System.out.print(queueItems[index++]);
                System.out.print((index < rear) ? "," : ".");
            }
        }
    }
}
