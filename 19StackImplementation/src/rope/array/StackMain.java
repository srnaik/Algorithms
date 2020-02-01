package rope.array;

public class StackMain {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(3);
        stack.push(6);
        stack.push(0);
        stack.displayItems();
        System.out.println();
        System.out.println("Item on Top : "+ stack.peek());
        System.out.println("Popped Item: " + stack.pop());
        System.out.println("Display Stack Items After pop() operation");
        stack.displayItems();
        if(stack.isEmpty())
            System.out.println("Stack is Empty");
        else
            System.out.println("Stack is not Empty");
    }
}
