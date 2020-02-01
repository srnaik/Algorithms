package rope;

public class Node {

    private int data;
    public Node next;

    public Node(int data){
        this.data = data;
    }


    public void add(int data){
        Node node = new Node(data);
        Node head = this;
        while (head.next!= null){
            head = head.next;
        }
        head.next = node;
    }

    public Node delete(int data, Node head){

        Node tempHead = head;
        if(tempHead.data == data)
            return tempHead.next;
        while (tempHead.next != null){
            if(tempHead.next.data == data) {
                tempHead.next = tempHead.next.next;
                return head;
            }
            tempHead = tempHead.next;
        }
        return head;
    }

    public void display(Node head){
        while (head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public Node mergeLists( Node n1, Node n2){
        Node node = new Node(0);
        Node temp = node;

        while (n1 != null && n2 != null) {
            if (n1.data < n2.data) {
                temp.next = n1;
                n1 = n1.next;
            } else {
                temp.next = n2;
                n2 = n2.next;
            }
            temp = temp.next;
        }
            if (n1 != null)
                temp.next = n1;
            if (n2 != null)
                temp.next = n2;


        return node.next;
    }


    public void addNodes(){

    }
}
