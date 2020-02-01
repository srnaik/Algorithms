package rope;

public class MergeListsImpl {

    public static void main(String[] args) {
        Node n1 = new Node(10);
        n1.add(20);
        n1.add(30);

        Node n2 = new Node(40);
        n2.add(50);
        n2.add(60);

        Node n3 = n1.mergeLists(n1,n2);
        System.out.println("**** List After Merging ****");
        n3.display(n3);
    }
}
