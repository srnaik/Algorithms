package rope;

public class AddNumbersImpl {

    public static void main(String[] args) {
        Node n1 = new Node(9);
        n1.add(9);
        //n1.add(3);

        Node n2 = new Node(1);
        //n2.add(6);
        //n2.add(4);

        Node n3 = n1.addTwoNumbers(n1,n2);
        System.out.println("**** List After Merging ****");
        n3.display(n3);
    }
}
