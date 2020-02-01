package rope;

public class QueueMain {

    public static void main(String[] args) {

        Queue queue = new Queue();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);
        queue.add(80);
        queue.display();
        System.out.println("\n Peek Element is: " + queue.peek());
        queue.pop();
        queue.display();
        System.out.println("\n Peek Element after 1 pop() operation is: " + queue.peek());
        if(queue.isEmpty())
            System.out.println("Queue is empty");
        else
            System.out.println("Queue is not empty");
    }
}
