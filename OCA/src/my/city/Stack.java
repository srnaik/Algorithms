package my.city;

public class Stack {

    public int top = -1;
    public Object[] data = new Object[10];
    private Stack stack = new Stack();

    public Object push(Object item){



        if(top >= data.length-1)
            throw new RuntimeException("Stack is Full");
        data[++top] = item;
        return item;
    }

    public Object pop(){
        if (top == -1)
            throw new RuntimeException("Stack is empty");

        return data[top--];

    }

    public Object peek(){
        if(top == -1)
            throw new RuntimeException("Stack is empty");
        return data[top];
    }

    public int search(Object item) {
       if(top == -1)
           throw new RuntimeException("Stack is empty");

       if(item == null){
           for(int i = 0; i <= top; i++){
               if(data[i] == item)
                   return i;
           }
       }else{
           for (int i = 0; i <= top; i++){
               if(data[i].equals(item))
                   return i;
           }
       }
       return -1;
    }

    public boolean isEmpty(){
        return (top < 0);
    }

    public void display(){

        if (top == -1)
            throw new RuntimeException("Stack is empty");
        int index = top;
        while(index >= 0) {
            System.out.print(data[index--]);
            System.out.print(index > 0 ? "," : ".");
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(8);
        stack.push(6);
        stack.pop();
        stack.pop();
        stack.display();
        System.out.println("Is Empty: " + stack.isEmpty());
        System.out.println("Is Empty: " + stack.isEmpty());
        System.out.println(stack.search(10));
        System.out.println("Top Element :" + stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
    }
}
