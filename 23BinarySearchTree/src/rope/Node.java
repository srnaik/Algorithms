package rope;

public class Node {

    int key;
    Node rightNode, leftNode;

    public Node(int key){
        this.key = key;
        rightNode = leftNode = null;
    }

}
