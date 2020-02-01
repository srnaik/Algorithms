package rope;

public class MirrorTreeMain {

    public static void main(String[] args) {
        Node node = new Node(1);
        node.leftNode = new Node(2);
        node.rightNode = new Node(3);
        node.leftNode.leftNode = new Node(4);
        node.rightNode.rightNode = new Node(5);

        MirrorTreeMain mirrorTreeMain = new MirrorTreeMain();
        System.out.println("**** Original Tree ****");
        mirrorTreeMain.inOrderTraversal(node);
        System.out.println("**** Original Tree ****");
        Node mirrorNode = mirrorTreeMain.mirrorTree(node);
        System.out.println("**** Mirror Tree ****");
        mirrorTreeMain.inOrderTraversal(node);
        System.out.println("**** Mirror Tree ****");
    }


    private void inOrderTraversal(Node node){
        if(node != null) {
            inOrderTraversal(node.leftNode);
            System.out.println(node.key);
            inOrderTraversal(node.rightNode);
        }
    }


    private Node mirrorTree(Node node){
        if (node == null)
            return node;
        Node left = mirrorTree(node.leftNode);
        Node right = mirrorTree(node.rightNode);
        node.rightNode = right;
        node.rightNode = left;
        return node;
    }
}
