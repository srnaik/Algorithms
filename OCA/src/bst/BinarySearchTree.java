package bst;

public class BinarySearchTree {

    private Node root;

    public BinarySearchTree(){
        root = null;
    }

    public void add(int key){
        add(key,root);
    }

    private void add(int key, Node root) {

        if (root == null) {
            root = new Node(key);
        } else if (root.key < key) {
            add(key,root.rightNode);
        }else{
            add(key,root.leftNode);
        }
    }

    public void display(){
        display(root);
    }

    private void display(Node root) {

        if(root == null){
            return;
        }

        if(root != null){
            display(root.leftNode);
            System.out.println(root.key);
            display(root.rightNode);
        }

    }

    public Node search(int key){
        return search(key,root);
    }

    private Node search(int key, Node root) {

        if (root == null || root.key == key) {
            return root;
        }else if(root.key < key) {
            return search(key, root.rightNode);
        }else{
           return  search(key,root.leftNode);
        }
    }

    public Node delete(int key){
        return delete(key,root);
    }

    private Node delete(int key, Node root) {

        if(root == null){
            return root;
        }else if( root.key < key){
            return delete(key,root.leftNode);
        }else if(root.key > key) {
            return delete(key,root.rightNode);
        }else {
            if (root.leftNode == null) {
                return root.rightNode;
            } else if (root.rightNode == null) {
                return root.leftNode;
            }

            root.key = minValue(root.rightNode);
            root.rightNode = delete(root.key, root.rightNode);
        }
        return root;
    }

    private int minValue(Node root) {
        int minValue = root.key;

        while(root.leftNode != null){
            minValue = root.leftNode.key;
            root = root.leftNode;
        }
        return minValue;
    }

}
