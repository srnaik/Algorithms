package rope;

public class Node {

     int data;
     Node leftNode;
     Node rightNode;

    public Node(int key){
        this.data = key;
        rightNode = null;
        leftNode = null;
    }

}
